package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "table_task")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TaskEntity {

	@Id
	@Column(name = "user_id")
	private UUID userId;
	private String infinitive;
	@Column(name = "grammatical_person")
	private String grammaticalPerson;
	@Column(name = "correct_answer")
	private String correctAnswer;

}
