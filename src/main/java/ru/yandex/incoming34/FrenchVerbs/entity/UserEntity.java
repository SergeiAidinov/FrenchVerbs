package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "table_user")
@NoArgsConstructor
@Getter
public class UserEntity {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private UUID userId;
	@Column(name = "given_name")
	private String givenName;
	@Column(name = "family_name")
	private String familyName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_verb", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "verb_id"))
	private List<ru.yandex.incoming34.FrenchVerbs.entity.Verb> verbs;

}
