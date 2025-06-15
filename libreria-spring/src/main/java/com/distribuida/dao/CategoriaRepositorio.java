package com.distribuida.dao;


import com.distribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria,Integer> {

    public Categoria findByCategoria(String categoria);
}
