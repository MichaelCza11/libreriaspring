package com.distribuida.service;

import com.distribuida.dao.ClienteRepositorio;
import com.distribuida.dao.LibroRepositorio;
import com.distribuida.model.Cliente;
import com.distribuida.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LibroServiceImpl implements LibroService{

    @Autowired//esta anotacion permite Inyectar Beans (Inyeccion de dependencias)
    private LibroRepositorio libroRepositorio;



    @Override
    public List<Libro> findAll() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro findOne(int id) {
        Optional<Libro> libro = libroRepositorio.findById(id);
        return libro.orElse(null);
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepositorio.save(libro);
    }

    @Override
    public Libro update(int id, Libro libro) {
        Libro libro1 = findOne(id);
        if(libro1 ==null){
            return null;
        }
        libro1.setDescripcion(libro.getDescripcion());
        libro1.setEdicion(libro.getEdicion());
        libro1.setEditorial(libro.getEditorial());
        libro1.setFechaPublicacion(libro.getFechaPublicacion());
        libro1.setIsbn(libro.getIsbn());
        libro1.setIdioma(libro.getIdioma());
        libro1.setTitulo(libro.getTitulo());
        libro1.setTipoPasta(libro.getTipoPasta());
        libro1.setIdioma(libro.getIdioma());
        libro1.setNumEjemplares(libro.getNumEjemplares());
        libro1.setNumPaginas(libro.getNumPaginas());

        return libroRepositorio.save(libro1);
    }

    @Override
    public void delete(int id) {
        if(libroRepositorio.existsById(2)){
            libroRepositorio.deleteById(2);

        }

    }

}
