package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
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
		case 0 -> je;
		case 1 -> tu;
		case 2 -> il;
		case 3 -> elle;
		case 4 -> nous;
		case 5 -> vous;
		case 6 -> ils;
		case 7 -> elles;
		default -> infinitive;
		};
	}

}
