package com.nttdata.escuelajava.project.service;

import java.util.List;

import com.nttdata.escuelajava.project.bean.Client;

public interface ClientService {
	List<Client> obtenerTodosLosClientes();
    Client obtenerClientePorId(Long id);
    Client crearCliente(Client cliente);
    Client actualizarCliente(Long id, Client cliente);
    void eliminarCliente(Long id);
}
