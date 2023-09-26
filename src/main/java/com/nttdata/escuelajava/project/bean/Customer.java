package com.nttdata.escuelajava.project.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId; // ID CLIENTE
    private String documentType; // TIPO DOCUMENTO
    private String documentNumber; // NUM DOCUMENTO
    private CustomerType customerType; // tipoCliente; enum : personal o empresarial


    public enum CustomerType {
        PERSONAL, // personal
        BUSINESS // empresarial
    }
}

