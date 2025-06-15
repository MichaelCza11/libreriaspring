package com.distribuida.dao;

import ch.qos.logback.core.net.server.Client;
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
public class ClienteRepositorioTestIntegracion {

    @Autowired //inyeccion de dependencias
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void findAll (){
        List<Cliente> clientes = clienteRepositorio.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size()>0);

        for (Cliente item : clientes) {
            System.out.println(item.toString());

        }


    }

@Test
    public void findOne(){
        Optional<Cliente> cliente =clienteRepositorio.findById(1);
        assertTrue(cliente.isPresent(), "El cliente con id=1 deberia en la base de datos");
        System.out.println(cliente.toString());


}
//insertar datos
@Test
    public void save(){
        Cliente cliente =new Cliente(0,"1726695396","Steven","Simbana","Lumbisi","0984241253","simbaa@ismac.edu");
        Cliente clienteGuardado = clienteRepositorio.save(cliente);
        assertNotNull(clienteGuardado.getInCliente(),"El cliente guardado debe tener un Id");
        assertEquals("1726695396",clienteGuardado.getCedula());
    assertEquals("Steven",clienteGuardado.getNombre());

}

//actualizar
 @Test
    public void update(){
        Optional<Cliente> clienteExistente = clienteRepositorio.findById(41);
        assertTrue(clienteExistente.isPresent());

       clienteExistente.orElse(null).setCedula("1712533412");
     clienteExistente.orElse(null).setNombre("Natanael");
     clienteExistente.orElse(null).setApellido("Chillan");
     clienteExistente.orElse(null).setDireccion("Lumbi");
     clienteExistente.orElse(null).setTelefono("0964180843");
     clienteExistente.orElse(null).setCorreo("natanael@ismac.edu.ec");

     Cliente clienteActualizado = clienteRepositorio.save(clienteExistente.orElse(null));

     assertEquals("Natanael",clienteActualizado.getNombre());
assertEquals("Chillan",clienteActualizado.getApellido());

 }

 //Borrar
    @Test
    public void delete(){
        if(clienteRepositorio.existsById(41)){
            clienteRepositorio.deleteById(41);

        }
        assertFalse(clienteRepositorio.existsById(41),"El id=41 deberia haberse eliminado");

    }
}
