package ru.yandex.incoming34.FrenchVerbs.ui;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class InitialView extends VerticalLayout {

	private final VerticalLayout verticalLayout = new VerticalLayout();
	private final Label helloLabel;

	public InitialView() {
		super();
		helloLabel = new Label("Bonjour");
		verticalLayout.add(helloLabel);
		add(verticalLayout);
	}

}
