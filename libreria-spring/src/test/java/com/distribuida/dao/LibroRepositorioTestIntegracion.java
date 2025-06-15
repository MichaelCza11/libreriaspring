package com.distribuida.dao;

import com.distribuida.model.Autor;
import com.distribuida.model.Categoria;
import com.distribuida.model.Libro;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class LibroRepositorioTestIntegracion {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Test
    public void findAll() {
        List<Libro> libros = libroRepositorio.findAll();
        assertNotNull(libros);
        assertTrue(libros.size() > 0);

        for (Libro item : libros) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne() {
        Optional<Libro> libroExistente = libroRepositorio.findById(1);
        assertNotNull(libroExistente.isPresent());
        assertEquals("Spring in Action", libroExistente.orElse(null).getTitulo(), "El libro deberia existir en BD ");
        assertEquals("Manning", libroExistente.orElse(null).getEditorial());
        System.out.println(libroExistente.toString());
    }

    //Guardar
    @Test
    public void save() {
        Optional<Categoria> categoria = categoriaRepositorio.findById(1);
        Optional<Autor> autor = autorRepositorio.findById(1);
        Libro libro = new Libro(0, "Quijote", "Stev", 1000, "1st", "Español", new Date(), "Libro del Quijote", "Pasta blanda", "111-1111111111", 100, "Portada", "Fisica", "50", categoria.orElse(null), autor.orElse(null));
        Libro libroGuardado = libroRepositorio.save(libro);
        assertNotNull(libroGuardado);
        assertEquals("Quijote", libroGuardado.getTitulo());
        assertEquals("Stev", libroGuardado.getEditorial());
    }

    //Actualizar
    @Test
    public void update () {
        Optional<Libro> libro = libroRepositorio.findById(79);
        Optional<Categoria> categoria = categoriaRepositorio.findById(2);
        Optional<Autor> autor = autorRepositorio.findById(2);

        libro.orElse(null).setTitulo("Amor");
        libro.orElse(null).setEditorial("Natan");
        libro.orElse(null).setNumPaginas(100);
        libro.orElse(null).setEdicion("primera");
        libro.orElse(null).setIdioma("Espa");
        libro.orElse(null).setFechaPublicacion(new Date());
        libro.orElse(null).setDescripcion("Natan");
        libro.orElse(null).setTipoPasta("Natan");
        libro.orElse(null).setIsbn("Natan");
        libro.orElse(null).setNumEjemplares(500);
        libro.orElse(null).setPortada("Natan");
        libro.orElse(null).setPresentacion("Natan");
        libro.orElse(null).setPrecio("50");
        libro.orElse(null).setCategoria(categoria.orElse(null));
        libro.orElse(null).setAutor(autor.orElse(null));


        Libro libroActualizado = libroRepositorio.save(libro.orElse(null));
    }
}

