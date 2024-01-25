package ru.yandex.incoming34.FrenchVerbs.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.yandex.incoming34.FrenchVerbs.dto.GrammaticalPerson.grammaticalPerson;
import ru.yandex.incoming34.FrenchVerbs.dto.Task;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.UserVerbRepository;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@Service
@AllArgsConstructor
public class MainService {

	private final VerbRepository verbRepository;
	private final UserVerbRepository userVerbRepository;
	private final Random random = new Random();

	public Iterable<ru.yandex.incoming34.FrenchVerbs.entity.Verb> find() {
		return verbRepository.findAll();
	}

	public Optional<Task> askQuestion(UUID userId) {
		final List<UUID> verbIds = !userVerbRepository.existsByUserId(userId) ? verbRepository.findAllVerbsId()
				: userVerbRepository.findAllVerbIdsByUserId(userId);
		UUID verbId = verbIds.get(random.nextInt(verbIds.size()));
		return createTaskOfVerb(verbId);

	}

	public void responded(String answer) {
		System.out.println("Responded: " + answer);
	}

	private Optional<Task> createTaskOfVerb(UUID verbId) {
		Optional<Verb> verb = verbRepository.findById(verbId);
		AtomicReference<Task> taskReference = new AtomicReference<>();
		verb.ifPresent(v -> {
			int ordinal = random.nextInt(7) + 1;
			Task task = new Task(v.getInfinitive(), v.getOrdinal(ordinal), grammaticalPerson.values()[ordinal].name());
			taskReference.set(task);
		});
		return Optional.ofNullable(taskReference.get());
	}

}
