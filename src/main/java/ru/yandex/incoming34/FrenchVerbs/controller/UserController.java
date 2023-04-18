package ru.yandex.incoming34.FrenchVerbs.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.entity.UserEntity;
import ru.yandex.incoming34.FrenchVerbs.repository.UserRepository;

@RestController
@AllArgsConstructor
public class UserController {

	private final UserRepository userRepository;

	@GetMapping("/all_users_with_verbs")
	Iterable<UserEntity> allUsersWithVerbs() {
		return userRepository.findAll();
	}

	@GetMapping("/all_users")
	Optional<UserEntity> allUsers() {
		return userRepository.findById(UUID.fromString("994bbeb2-d2b8-46dd-9ab4-34c41db2cc2e"));
	}

}
