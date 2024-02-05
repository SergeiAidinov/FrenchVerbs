package ru.yandex.incoming34.FrenchVerbs.ui;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.Route;

import jakarta.annotation.security.RolesAllowed;
import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.service.MainService;

@Route(value = "question")
@RolesAllowed("USER")
@AllArgsConstructor
public class QuestionView extends VerticalLayout {

	private final MainService mainService;

	private static final String RESPOND = "Répondre";
	private static final String INVITATION = "Conjuguons le verbe: ";
	private final TextField answerField = createAnswerField();
	private final TextField inviteField = createInviteField();
	private final Button respondButton = createRespondButton();
	private final VerticalLayout verticalLayout = createVerticalLayout();
	private final String WIDTH = "250px";
	private final String LAYOUT_WIDTH = "300px";

	@PostConstruct
	private void initialize() {

		List<FrenchLettersUtils.Letters> lettersList = FrenchLettersUtils.getAllLetters().stream()
				.collect(Collectors.toList());
		Iterator<FrenchLettersUtils.Letters> iterator = lettersList.iterator();

		while (iterator.hasNext()) {
			HorizontalLayout horizontalLayout = new HorizontalLayout();
			horizontalLayout.setWidth(LAYOUT_WIDTH);
			for (int i = 0; i < 3; i++) {
				if (iterator.hasNext()) {
					FrenchLettersUtils.Letters letter = iterator.next();
					Button nextButton = new Button(String.valueOf(letter.getSymbol()));
					nextButton.addSingleClickListener(
							clickEvent -> answerField.setValue(answerField.getValue() + letter.getSymbol()));
					horizontalLayout.add(nextButton);
				}
			}
			verticalLayout.add(horizontalLayout);
		}
		verticalLayout.add(respondButton);
		verticalLayout.setVisible(true);
		add(verticalLayout);
	}

	private TextField createAnswerField() {
		TextField answerField = new TextField();
		answerField.setWidth(WIDTH);
		return answerField;
	}

	private TextField createInviteField() {
		TextField inviteField = new TextField();
		inviteField.setWidth(WIDTH);
		inviteField.setValue(INVITATION);
		inviteField.setReadOnly(true);
		inviteField.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);
		return inviteField;
	}

	private Button createRespondButton() {
		Button respondButton = new Button(RESPOND);
		respondButton.setWidth(WIDTH);
		respondButton.addSingleClickListener(clickEvent -> {
			String answer = answerField.getValue();
			inviteField.setValue(answer);
			// mainService.checkAnswer(null, answer);
			respondButton.getUI().ifPresent(ui -> ui.navigate(CheckAnswer.class));
		});
		return respondButton;
	}

	private VerticalLayout createVerticalLayout() {
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setWidth(LAYOUT_WIDTH); //
		verticalLayout.add(inviteField);
		verticalLayout.add(answerField);
		return verticalLayout;
	}

}