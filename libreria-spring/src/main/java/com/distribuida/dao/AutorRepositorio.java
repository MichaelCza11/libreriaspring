package com.distribuida.dao;
import com.distribuida.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository //esto es un bean para manejo de persistencia
public interface AutorRepositorio extends JpaRepository<Autor,Integer> {

    public Autor findByNombre(String nombre);
}
