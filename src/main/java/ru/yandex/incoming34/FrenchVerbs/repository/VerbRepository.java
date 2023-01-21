package ru.yandex.incoming34.FrenchVerbs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.FrenchVerbs.entity.Verb;

@Repository
public interface VerbRepository extends CrudRepository<Verb, Integer> {

	Verb findByInfinitive(String infinitive);

}
