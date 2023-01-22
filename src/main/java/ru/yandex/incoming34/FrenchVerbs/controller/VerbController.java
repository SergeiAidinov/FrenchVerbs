package ru.yandex.incoming34.FrenchVerbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

//@Controller
@RestController
public class VerbController {

	@Autowired
	VerbRepository verbRepository;

	@GetMapping("/allverbs")
	public Iterable<Verb> met() {

		// return Collections.emptyList();

		return verbRepository.findAll();

	}

}
