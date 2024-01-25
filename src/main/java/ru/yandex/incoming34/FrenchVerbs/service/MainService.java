package ru.yandex.incoming34.FrenchVerbs.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.dto.GrammaticalPerson.grammaticalPerson;
import ru.yandex.incoming34.FrenchVerbs.entity.TaskEntity;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.TaskRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.UserVerbRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@Service
@AllArgsConstructor
public class MainService {

	private final VerbRepository verbRepository;
	private final UserVerbRepository userVerbRepository;
	private final TaskRepository taskRepository;
	private final Random random = new Random();

	public Iterable<Verb> find() {
		return verbRepository.findAll();
	}

	public Optional<TaskEntity> askQuestion(UUID userId) {
		final List<UUID> verbIds = !userVerbRepository.existsByUserId(userId) ? verbRepository.findAllVerbsIds()
				: userVerbRepository.findAllVerbIdsByUserId(userId);
		UUID verbId = verbIds.get(random.nextInt(verbIds.size()));
		return createTaskOfVerb(userId, verbId);

	}

	public boolean checkAnswer(UUID userId, String answer) {
		System.out.println("Responded: " + answer);
		Optional<TaskEntity> taskEntityOptional = taskRepository.findById(userId);
		if (taskEntityOptional.isPresent()) {
			return taskEntityOptional.get().getCorrectAnswer().equals(answer);
		}
		return false;
	}

	private Optional<TaskEntity> createTaskOfVerb(UUID userId, UUID verbId) {
		Optional<Verb> verbOptional = verbRepository.findById(verbId);
		if (verbOptional.isPresent()) {
			int ordinal = random.nextInt(8);
			TaskEntity taskEntity = new TaskEntity(userId, verbOptional.get().getInfinitive(),
					grammaticalPerson.values()[ordinal].name(), verbOptional.get().getOrdinal(ordinal));
			taskRepository.save(taskEntity);
			return Optional.of(taskEntity);
		}
		return Optional.empty();
	}

}
