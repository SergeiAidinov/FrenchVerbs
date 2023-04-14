package ru.yandex.incoming34.FrenchVerbs.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.entity.UserVerb;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.UserVerbRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@RestController
@RequiredArgsConstructor
public class VerbController {

	private final VerbRepository verbRepository;
	private final UserVerbRepository userVerbRepository;

	@GetMapping("/allverbs")
	public Iterable<Verb> allVerbs() {
		return verbRepository.findAll();
	}

	@PutMapping("/addverb/{userId}/{verbId}")
	public Optional<Verb> addVerb(@Schema(example = "77858ba0-56d7-44e0-b190-dd659d243ef0") @PathVariable UUID userId,
			@Schema(example = "1") @PathVariable Integer verbId) {

		UserVerb userVerb = new UserVerb(userId, verbId);
		userVerbRepository.save(userVerb);
		return verbRepository.findById(verbId);

	}

	@DeleteMapping("/deleteverb/{userId}/{verbId}")
	public Optional<Verb> deleteVerb(
			@Schema(example = "77858ba0-56d7-44e0-b190-dd659d243ef0") @PathVariable UUID userId,
			@Schema(example = "1") @PathVariable Integer verbId) {

		int deletedRecords = userVerbRepository.deleteByUserIdAndVerb(userId, verbId);
		if (deletedRecords == 1) {
			return verbRepository.findById(verbId);
		} else {
			return Optional.empty();
		}

	}

}
