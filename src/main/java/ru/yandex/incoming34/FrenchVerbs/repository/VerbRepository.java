package ru.yandex.incoming34.FrenchVerbs.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.FrenchVerbs.entity.Verb;

@Repository
public interface VerbRepository extends CrudRepository<Verb, UUID> {

	Verb findByInfinitive(String infinitive);

	@Query(nativeQuery = true, value = "SELECT verb_id FROM verb")
	List<UUID> findAllVerbsIds();

}
