package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "verb")
public class Verb {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "verb_id")
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
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "user_verb", joinColumns = @JoinColumn(name = "verb_id"),
	 * inverseJoinColumns = @JoinColumn(name = "user_id")) private List<UserEntity>
	 * users;
	 */

}
