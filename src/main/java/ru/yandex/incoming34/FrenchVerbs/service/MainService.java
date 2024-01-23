package ru.yandex.incoming34.FrenchVerbs.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@Service
@AllArgsConstructor
public class MainService {

	private final VerbRepository verbRepository;

	public Iterable<ru.yandex.incoming34.FrenchVerbs.entity.Verb> find() {
		return verbRepository.findAll();
	}

	public void responded(String answer) {
		System.out.println("Responded: " + answer);
	}

}
