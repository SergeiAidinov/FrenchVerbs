package ru.yandex.incoming34.FrenchVerbs.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.FrenchVerbs.entity.UserVerb;

@Repository
public interface UserVerbRepository extends CrudRepository<UserVerb, UUID> {

}
