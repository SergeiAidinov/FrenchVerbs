package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user_verb")
@RequiredArgsConstructor
public class UserVerb {

	@jakarta.persistence.Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private UUID id;
	@Column(name = "user_id")
	private final UUID userId;
	@Column(name = "verb_id")
	private final UUID verb;

}
