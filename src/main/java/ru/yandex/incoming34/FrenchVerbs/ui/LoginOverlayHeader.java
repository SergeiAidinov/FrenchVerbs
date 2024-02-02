package ru.yandex.incoming34.FrenchVerbs.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.Route;

import jakarta.annotation.PostConstruct;
import ru.yandex.incoming34.FrenchVerbs.entity.UserEntity;
import ru.yandex.incoming34.FrenchVerbs.service.LoginService;

@Route("login")
//@AllArgsConstructor
@Service
public class LoginOverlayHeader extends Div {

	@Autowired
	private LoginService loginService;
	LoginOverlay loginOverlay = new LoginOverlay();

	@PostConstruct
	private void init() {
		loginOverlay.setTitle("Verbes français");
		loginOverlay.setDescription("L'application pour mémoriser les verbes français");
		loginOverlay.addLoginListener(event -> {
			List<UserEntity> ue = loginService.tryLog(event.getUsername(), event.getPassword());
			if (ue.size() == 0)
				loginOverlay.setError(true);
			ue.stream().forEach(u -> System.out.println(u));
		});
		add(loginOverlay);
		loginOverlay.setOpened(true);
		loginOverlay.getElement().setAttribute("no-autofocus", "");
	}

}
