package ru.yandex.incoming34.FrenchVerbs.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class InitialView extends VerticalLayout {

	private final VerticalLayout verticalLayout = new VerticalLayout();
	private final Label helloLabel = new Label("Bonjour");
	private final Button userButton;
	private final Button guestButton;

	public InitialView() {
		super();
		verticalLayout.add(helloLabel);
		userButton = new Button("User");
		guestButton = new Button("Guest");
		userButton.addSingleClickListener(clickEvent -> {
			System.out.println("User!");
		});
		guestButton.addSingleClickListener(clickEvent -> {
			System.out.println("Guest!");
		});
		verticalLayout.add(userButton);
		verticalLayout.add(guestButton);
		add(verticalLayout);
	}

}
