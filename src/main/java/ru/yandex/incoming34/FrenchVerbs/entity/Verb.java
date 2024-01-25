package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "verb")
public class Verb {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@jakarta.persistence.Column(name = "verb_id")
	private UUID id;
	private String infinitive;
	private String je;
	private String tu;
	private String il;
	private String elle;
	private String nous;
	private String vous;
	private String ils;
	private String elles;

	public String getOrdinal(int ordinal) {
		return switch (ordinal) {
		case 1 -> je;
		case 2 -> tu;
		case 3 -> il;
		case 4 -> elle;
		case 5 -> nous;
		case 6 -> vous;
		case 7 -> ils;
		case 8 -> elles;
		default -> infinitive;
		};
	}

}
