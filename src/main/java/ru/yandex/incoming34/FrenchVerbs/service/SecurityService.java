package ru.yandex.incoming34.FrenchVerbs.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.vaadin.flow.spring.security.AuthenticationContext;

@Component
public class SecurityService {

	private static final String LOGOUT_SUCCESS_URL = "/";

	private final AuthenticationContext authenticationContext;

	public SecurityService(AuthenticationContext authenticationContext) {
		this.authenticationContext = authenticationContext;
	}

	public UserDetails getAuthenticatedUser() {
		return authenticationContext.getAuthenticatedUser(UserDetails.class).get();
	}

	public void logout() {
		authenticationContext.logout();
	}
}