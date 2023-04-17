package ru.yandex.incoming34.FrenchVerbs.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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

}
