package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user_verb")
@RequiredArgsConstructor
public class UserVerb {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private UUID id;
	@Column(name = "user_id")
	private final UUID userId;
	@Column(name = "verb_id")
	private final UUID verb;

}
