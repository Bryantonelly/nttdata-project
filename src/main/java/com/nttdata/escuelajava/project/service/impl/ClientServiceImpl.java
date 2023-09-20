package com.nttdata.escuelajava.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.escuelajava.project.bean.Client;
import com.nttdata.escuelajava.project.repository.ClientRepository;
import com.nttdata.escuelajava.project.service.ClientService;
import com.nttdata.escuelajava.project.util.ResourceNotFoundException;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> obtenerTodosLosClientes() {
	    return clientRepository.findAll();
	}

	@Override
	public Client obtenerClientePorId(Long id) {
	    return clientRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));
	}

	@Override
	public Client crearCliente(Client cliente) {
	    return clientRepository.save(cliente);
	}

	@Override
	public Client actualizarCliente(Long id, Client cliente) {
	    Client clienteExistente = clientRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));

	    clienteExistente.setDocumentType(cliente.getDocumentType());
	    clienteExistente.setDocumentNumber(cliente.getDocumentNumber());
	    clienteExistente.setClientType(cliente.getClientType());

	    return clientRepository.save(clienteExistente);
	}

	@Override
	public void eliminarCliente(Long id) {
	    Client cliente = clientRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));

	    clientRepository.delete(cliente);
	}

}
