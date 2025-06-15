package com.distribuida.dao;

import com.distribuida.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository //esto es un bean para manejo de persistencia
public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {

    public Cliente findByCedula(String cedula);
}
