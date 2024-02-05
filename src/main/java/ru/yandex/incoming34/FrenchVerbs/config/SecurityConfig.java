package ru.yandex.incoming34.FrenchVerbs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.vaadin.flow.spring.security.VaadinWebSecurity;

import ru.yandex.incoming34.FrenchVerbs.ui.LoginView;

@EnableWebSecurity

@Configuration
public class SecurityConfig extends VaadinWebSecurity {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers(AntPathRequestMatcher.antMatcher(HttpMethod.GET, "/images/*.png")).permitAll());

		super.configure(http);
		setLoginView(http, LoginView.class);

	}

	@Bean
	public UserDetailsService users() {
		UserDetails user = User.builder().username("user")
				// password = password with this hash, don't tell anybody :-)
				.password("{bcrypt}$2y$10$d8T3gKF9rf2Po2rnk3/Bb.pSjpzhiRfqM7JeRNmFfnGu/YpaDXP66").roles("USER").build();
		UserDetails admin = User.builder().username("admin")
				.password("{bcrypt}$2y$10$WzBD3ihFMjPZpo8LEHjQ7e2T.4YyufoDzmPspvWVqqoQBA6p8hfH.").roles("USER", "ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user, admin);

	}
}