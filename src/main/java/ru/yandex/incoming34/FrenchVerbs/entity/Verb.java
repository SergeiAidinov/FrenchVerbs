package ru.yandex.incoming34.FrenchVerbs.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Verb {

	@Id
	private String infinitive;
	private String je;
	private String tu;
	private String il;
	private String elle;
	private String nous;
	private String vous;
	private String ils;
	private String elles;

}
