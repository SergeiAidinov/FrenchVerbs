package ru.yandex.incoming34.FrenchVerbs.service;

import org.apache.commons.lang3.tuple.Triple;
import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@Service(value = "mainservice")
public class MainService {

	@Autowired
	VerbRepository verbRepository;

	public Iterable<ru.yandex.incoming34.FrenchVerbs.entity.Verb> find() {
		return verbRepository.findAll();
	}

}
