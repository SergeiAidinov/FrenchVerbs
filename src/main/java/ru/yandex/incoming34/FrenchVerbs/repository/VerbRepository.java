package ru.yandex.incoming34.FrenchVerbs.repository;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;

import java.util.List;
import java.util.UUID;

@Repository
public interface VerbRepository extends CrudRepository<Verb, UUID> {

	Verb findByInfinitive(String infinitive);

}
