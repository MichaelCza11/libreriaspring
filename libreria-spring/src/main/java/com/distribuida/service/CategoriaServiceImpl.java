package com.distribuida.service;


import com.distribuida.dao.CategoriaRepositorio;
import com.distribuida.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> findAll(){
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria findOne(int id){
        Optional<Categoria> categoria = categoriaRepositorio.findById(id);
        return categoria.orElse(null);
    }

    @Override
    public Categoria save (Categoria categoria){
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria update (int id, Categoria categoria){
        Categoria categoriaExistente = findOne(id);
        if(categoriaExistente ==null){
            return null;
        }
        categoriaExistente.setCategoria(categoria.getCategoria());
        categoriaExistente.setDescripcion(categoria.getCategoria());

        return categoriaRepositorio.save(categoriaExistente);
    }

    @Override
    public void delete(int id){
        if(categoriaRepositorio.existsById(id)){
            categoriaRepositorio.deleteById(id);
        }

    }

}
