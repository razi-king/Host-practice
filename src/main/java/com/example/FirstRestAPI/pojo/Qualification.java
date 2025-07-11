package com.example.FirstRestAPI.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int ssc;
	private int hsc;
	private int graduation;
	private String description;
	@OneToOne
	private Emp emp;
	
}
