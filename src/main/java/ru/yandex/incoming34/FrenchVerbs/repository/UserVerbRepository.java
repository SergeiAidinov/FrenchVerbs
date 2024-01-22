package ru.yandex.incoming34.FrenchVerbs.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.yandex.incoming34.FrenchVerbs.entity.UserVerb;

@Repository
public interface UserVerbRepository extends CrudRepository<UserVerb, UUID> {

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "DELETE FROM user_verb WHERE user_id = :userId AND verb_id = :verb")
	Integer deleteByUserIdAndVerb(@Param("userId") UUID userId, @Param("verb") UUID verbId);

	@Query(nativeQuery = true, value = "SELECT verb_id FROM user_verb WHERE user_id = :userId")
	Iterable<String> findAllVerbIdsByUserId(@Param("userId") UUID userId);

}
