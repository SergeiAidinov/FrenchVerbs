package ru.yandex.incoming34.FrenchVerbs.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.entity.TaskEntity;
import ru.yandex.incoming34.FrenchVerbs.service.MainService;

@RestController
@AllArgsConstructor
public class MainController {

	private final MainService mainService;

	@PutMapping("/new_task")
	public Optional<TaskEntity> createTaskOfVerb(UUID userId) {
		return mainService.askQuestion(userId);
	}

	@PutMapping("/answer")
	public boolean answer(UUID userId, String answer) {
		return mainService.checkAnswer(userId, answer);
	}

}
