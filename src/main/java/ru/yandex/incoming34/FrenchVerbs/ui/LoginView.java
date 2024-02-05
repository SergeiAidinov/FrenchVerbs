package ru.yandex.incoming34.FrenchVerbs.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
//@AllArgsConstructor
//@Service
@AnonymousAllowed
public class LoginView extends VerticalLayout implements BeforeEnterObserver {

	/*
	 * @Autowired private LoginService loginService;
	 */
	// private final LoginForm loginOverlay = new LoginForm();

	private final LoginForm login = new LoginForm();

	public LoginView() {
		addClassName("login-view");
		setSizeFull();

		setAlignItems(Alignment.CENTER);
		setJustifyContentMode(JustifyContentMode.CENTER);

		login.setAction("login");

		add(new H1("Vaadin CRM"), login);
	}

	@Override
	public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
		// inform the user about an authentication error
		if (beforeEnterEvent.getLocation()

				.getQueryParameters().getParameters().containsKey("error")) {
			login.setError(true);
		}
	}

}
