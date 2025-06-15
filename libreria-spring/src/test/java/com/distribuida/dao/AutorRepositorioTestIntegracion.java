package com.distribuida.dao;


import com.distribuida.model.Autor;
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
public class AutorRepositorioTestIntegracion {

    @Autowired//inyeccion de dependencias
    private AutorRepositorio autorRepositorio;

    @Test
    public void findAll (){
        List<Autor> autors = autorRepositorio.findAll();
        assertNotNull(autors);
        assertTrue(autors.size()>0);

        for(Autor item : autors){
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne(){
        Optional<Autor> autor = autorRepositorio.findById(1);
        assertTrue(autor.isPresent(), "El autor con id=1 deberia existir en la base de datos");
        System.out.println(autor.toString());
    }

    @Test
    public void save(){
        Autor autor = new Autor(0, "Steven", "Simbana", "Ecuador", "Lumbisi", "0984241253", "natanael@ismac.com");
        Autor autorGuardado = autorRepositorio.save(autor);
        assertNotNull(autorGuardado.getIdAutor(),"El cliente guardado debe tener un Id");
        assertEquals("Steven",autorGuardado.getNombre());
        assertEquals("Simbana",autorGuardado.getApellido());

    }
    @Test
    public void update (){
        Optional<Autor> autorExistente = autorRepositorio.findById(55);
        assertTrue(autorExistente.isPresent());

        autorExistente.orElse(null).setNombre("Steven1");
        autorExistente.orElse(null).setApellido("Simbana1");
        autorExistente.orElse(null).setPais("Ecuador1");
        autorExistente.orElse(null).setDireccion("Lumbisi1");
        autorExistente.orElse(null).setTelefono("10984241253");
        autorExistente.orElse(null).setCorreo("1natanael@ismac.com");

        Autor autorActualizado = autorRepositorio.save(autorExistente.orElse(null));

        assertEquals("Steven1", autorActualizado.getNombre());
        assertEquals("Simbana1", autorActualizado.getApellido());

    }
@Test
    public void delete(){
        if(autorRepositorio.existsById(56)){
            autorRepositorio.deleteById(56);
        }
        assertFalse(autorRepositorio.existsById(56),"El id=56 deberia haberse eliminado");

}



}
