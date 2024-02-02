package ru.yandex.incoming34.FrenchVerbs.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/answer")
public class CheckAnswer extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public CheckAnswer() {
		System.out.println("Check answer");
	}

}
