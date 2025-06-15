package com.distribuida.service;

import com.distribuida.dao.ClienteRepositorio;
import com.distribuida.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Esto es un bean para logica de negocio
public class ClienteServiceImpl implements ClienteService{

    @Autowired//esta anotacion permite Inyectar Beans (Inyeccion de dependencias)
    private ClienteRepositorio clienteRepositorio;



    @Override
    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente findOne(int id) {
        Optional<Cliente> cliente = clienteRepositorio.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public Cliente update(int id, Cliente cliente) {
        Cliente clienteExistente = findOne(id);
        if(clienteExistente ==null){
            return null;
        }
        clienteExistente.setCedula(cliente.getCedula());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setApellido(cliente.getApellido());
        clienteExistente.setDireccion(cliente.getDireccion());
        clienteExistente.setTelefono(cliente.getTelefono());
        clienteExistente.setCorreo(cliente.getCorreo());

        return clienteRepositorio.save(clienteExistente);
    }

    @Override
    public void delete(int id) {
        if(clienteRepositorio.existsById(id)){
            clienteRepositorio.deleteById(id);

        }

    }
}
