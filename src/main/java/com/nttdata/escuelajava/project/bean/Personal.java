package com.nttdata.escuelajava.project.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Personal extends Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personalId; 
	private String firstName; // NOMBRES
    private String lastName; // APELLIDO PATERNO
    private String middleName; // APELLIDO MATERNO
}
