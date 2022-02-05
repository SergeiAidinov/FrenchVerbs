package ru.yandex.incoming34.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="pronoms")
public class Pronom {
	
	@Id
	@Column(name="id")
	Long id;
	
	@Column(name="pronom")
	String pronom;

}
