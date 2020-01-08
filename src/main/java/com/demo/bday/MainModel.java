package com.demo.bday;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "person")
public class MainModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;

	@Column
	private String username;

	@Column(name = "date")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuserName() {
		return username;
	}

	public void setuserName(String name) {
		this.username = name;
	}
}
