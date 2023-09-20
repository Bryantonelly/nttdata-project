package com.nttdata.escuelajava.project.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientId; // ID CLIENTE
    private String documentType; // TIPO DOCUMENTO
    private String documentNumber; // NUM DOCUMENTO
    private ClientType clientType; // tipoCliente; enum : personal o empresarial


    public enum ClientType {
        PERSONAL, // personal
        BUSINESS // empresarial
    }
}

