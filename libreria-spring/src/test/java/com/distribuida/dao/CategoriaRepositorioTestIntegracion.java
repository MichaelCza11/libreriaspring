package com.distribuida.dao;

import com.distribuida.model.Categoria;
import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class CategoriaRepositorioTestIntegracion {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    public void findAll (){
        List<Categoria> categorias = categoriaRepositorio.findAll();
        assertNotNull(categorias);
        assertTrue( categorias.size()>0);

        for(Categoria item :categorias){
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne(){
        Optional<Categoria> categoria =categoriaRepositorio.findById(1);
        assertTrue(categoria.isPresent(),"La categoria con id=1 deberia existir en la BD");
        System.out.println(categoria.toString());
    }

    @Test//insertar datos
    public void save(){
        Categoria categoria =new Categoria(0,"Ingles","Libros de ingles");
        Categoria categoriaGuardado = categoriaRepositorio.save(categoria);
        assertNotNull(categoriaGuardado.getIdCategoria(),"La categoria guardada debe tener un ID");
        assertEquals("Ingles", categoriaGuardado.getCategoria());
    }

    @Test//Actualizar
    public void update(){
        Optional<Categoria> categoriaExistente = categoriaRepositorio.findById(59);
        assertTrue(categoriaExistente.isPresent());

        categoriaExistente.orElse(null).setCategoria("English");
        categoriaExistente.orElse(null).setDescripcion("Books English");

        Categoria categoriaActualizado = categoriaRepositorio.save(categoriaExistente.orElse(null));
        assertEquals("English",categoriaActualizado.getCategoria());
        assertEquals("Books English",categoriaActualizado.getDescripcion());
    }

    @Test //Borrar
    public void delete(){
        if(categoriaRepositorio.existsById(60)){
            categoriaRepositorio.deleteById(60);
        }
        assertFalse(categoriaRepositorio.existsById(60),"El Id=60 deberia haberse eliminado");
    }
}
