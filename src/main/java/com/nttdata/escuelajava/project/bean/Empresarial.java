package com.nttdata.escuelajava.project.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Empresarial extends Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empresarialId; 
    private String businessName; // RAZON SOCIAL
    private String accountHolder; // TITULAR CUENTA

}
