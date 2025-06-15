package com.distribuida.principal;

import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;
import com.distribuida.entities.Factura;

import java.util.Date;

public class FacturaDetallePrincipal {
    public static void main(String[] args){
        //SET DE = FACTURA, ESCRIBIMOS COMO EN LIBRO
        Factura factura = new Factura();
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(15.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        //SET FACTURA ^^

        //LLAMAMOS CLASE LIBRO
        Libro libro = new Libro(1,"Habitos Atomicos","Roca editorial",300,"Primera Edicion","Esp","Superacion","Pasta blanda","001-01-001",10,"azul","Libro de bolsillo","10.99");

        //LLAMAMOS CLASE FACTURADETALLE
        FacturaDetalle facturadetalle = new FacturaDetalle(1,2, 15.50F);

        //Seteamos a factura detalle factura y libro
        facturadetalle.setFactura(factura);
        facturadetalle.setLibro(libro);

        System.out.println(facturadetalle.toString());
    }
}
