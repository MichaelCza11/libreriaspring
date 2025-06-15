package com.distribuida.test;

import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1,"1726695396","Steven","Simbana","Lumbisi","0984241253","natanaelsimbaa@yahoo.es");
    }

    @Test
    public void testclienteConstructorAndGetter(){
        assertAll("Validar datos cliente",
                () -> assertEquals(1, cliente.getInCliente()),
                () -> assertEquals("1726695396", cliente.getCedula()),
                () -> assertEquals("Steven", cliente.getNombre()),
                () -> assertEquals("Simbana", cliente.getApellido()),
                () -> assertEquals("Lumbisi", cliente.getDireccion()),
                () -> assertEquals("0984241253", cliente.getTelefono()),
                () -> assertEquals("natanaelsimbaa@yahoo.es", cliente.getCorreo())
                );
    }

    @Test
    public void testClienteSetters(){
        cliente = new Cliente();

        cliente.setInCliente(3);
        cliente.setCedula("1111");
        cliente.setNombre("stev");
        cliente.setApellido("simbaa");
        cliente.setDireccion("Lumbisi");
        cliente.setTelefono("03446541");
        cliente.setCorreo("sn@ismac.edu.ec");

        assertAll("Validar datos cliente ",
                () -> assertEquals(3,cliente.getInCliente()),
                () -> assertEquals("1111",cliente.getCedula()),
                () -> assertEquals("stev",cliente.getNombre()),
                () -> assertEquals("simbaa",cliente.getApellido()),
                () -> assertEquals("Lumbisi",cliente.getDireccion()),
                () -> assertEquals("03446541",cliente.getTelefono()),
                () -> assertEquals("sn@ismac.edu.ec",cliente.getCorreo())
        );
    }

    @Test
    public void TestToString(){
        String str = cliente.toString();
        assertAll("Validar datos de cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1726695396")),
                () -> assertTrue(str.contains("Steven")),
                () -> assertTrue(str.contains("Simbana")),
                () -> assertTrue(str.contains("Lumbisi")),
                () -> assertTrue(str.contains("0984241253")),
                () -> assertTrue(str.contains("natanaelsimbaa@yahoo.es"))
        );


    }
}

