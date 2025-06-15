package com.distribuida.service;

import com.distribuida.dao.FacturaRepositorio;
import com.distribuida.model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired//esta anotacion permite Inyectar Beans (Inyeccion de dependencias)
    private FacturaRepositorio facturaRepositorio;



    @Override
    public List<Factura> findAll() {
        return facturaRepositorio.findAll();
    }

    @Override
    public Factura findOne(int id) {
        Optional<Factura> factura = facturaRepositorio.findById(id);
        return factura.orElse(null);
    }

    @Override
    public Factura save(Factura factura) {
        return facturaRepositorio.save(factura);
    }

    @Override
    public Factura update(int id, Factura factura) {
        Factura factura1 = findOne(id);
        if(factura1 ==null){
            return null;
        }
        factura1.setNumFactura(factura.getNumFactura());
        factura1.setFecha(factura.getFecha());
        factura1.setIva(factura.getIva());
        factura1.setTotal(factura.getTotal());
        factura1.setTotalNeto(factura.getTotalNeto());

        return facturaRepositorio.save(factura1);
    }

    @Override
    public void delete(int id) {
        if(facturaRepositorio.existsById(2)){
            facturaRepositorio.deleteById(2);

        }

    }

}
