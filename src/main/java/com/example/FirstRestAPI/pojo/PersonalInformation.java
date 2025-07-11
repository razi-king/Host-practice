package com.example.FirstRestAPI.pojo;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class PersonalInformation {
	private int id;
	private double height;
	private String birthDate;
	private String birthPlace;
}
