package ru.yandex.incoming34.FrenchVerbs.controller;

import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.entity.UserEntity;
import ru.yandex.incoming34.FrenchVerbs.entity.UserVerb;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.UserRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.UserVerbRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@RestController
@RequiredArgsConstructor
public class VerbController {

	private final VerbRepository verbRepository;
	private final UserVerbRepository userVerbRepository;
	private final UserRepository userRepository;

	@GetMapping("/all_verbs")
	public Iterable<Verb> allVerbs() {
		return verbRepository.findAll();
	}

	@PutMapping("/new_verb_in_list/{userId}/{verbId}")
	public Optional<Verb> addVerb(@Schema(example = "77858ba0-56d7-44e0-b190-dd659d243ef0") @PathVariable UUID userId,
			@Schema(example = "e634fa6e-5e8f-4f3b-9888-55b022df263a") @PathVariable UUID verbId) {

		UserVerb userVerb = new UserVerb(userId, verbId);
		userVerbRepository.save(userVerb);

		return verbRepository.findById(verbId);

	}

	@DeleteMapping("/verb_to_be_removed_from_list/{userId}/{verbId}")
	public Optional<Verb> deleteVerb(
			@Schema(example = "77858ba0-56d7-44e0-b190-dd659d243ef0") @PathVariable UUID userId,
			@Schema(example = "b603ed50-5012-4924-863a-da4c97b91656") @PathVariable UUID verbId) {

		int deletedRecords = userVerbRepository.deleteByUserIdAndVerb(userId, verbId);
		if (deletedRecords == 1) {
			return verbRepository.findById(verbId);
		} else {
			return Optional.empty();
		}

	}

	@GetMapping("/all_verbs_of_user/{userId}")
	public Iterable<Verb> allVerbsOfUser(
			@Schema(example = "77858ba0-56d7-44e0-b190-dd659d243ef0") @PathVariable UUID userId) {
		Optional<UserEntity> userOptional = userRepository.findById(userId);
		return userOptional.isPresent() ? userOptional.get().getVerbs() : Collections.emptyList();

	}

}
