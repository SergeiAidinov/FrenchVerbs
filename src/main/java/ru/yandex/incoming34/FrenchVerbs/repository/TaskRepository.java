package ru.yandex.incoming34.FrenchVerbs.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.FrenchVerbs.entity.TaskEntity;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, UUID> {

}
