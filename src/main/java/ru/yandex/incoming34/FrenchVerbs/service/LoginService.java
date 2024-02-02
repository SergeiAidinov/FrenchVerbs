package ru.yandex.incoming34.FrenchVerbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.entity.UserEntity;
import ru.yandex.incoming34.FrenchVerbs.repository.UserRepository;

@Service
@AllArgsConstructor
public class LoginService {

	private final UserRepository userRepository;

	public List<UserEntity> tryLog(String userEmail, String userPassword) {

		return userRepository.findByEmailAndPassword(userEmail, userPassword);

	}

}
