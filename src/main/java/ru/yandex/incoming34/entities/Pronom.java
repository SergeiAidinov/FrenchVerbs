package ru.yandex.incoming34.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Getter;

//@Data
@Entity
@Table(name="pronoms")
public class Pronom {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPronom() {
		return pronom;
	}

	public void setPronom(String pronom) {
		this.pronom = pronom;
	}

	@Id
	@Column(name="id")
	Long id;
	
	@Column(name="pronom")
	String pronom;

}
