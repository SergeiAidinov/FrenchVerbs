package ru.yandex.incoming34.FrenchVerbs.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.FrenchVerbs.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

	public List<UserEntity> findByEmailAndPassword(String userEmail, String userPassword);

}
