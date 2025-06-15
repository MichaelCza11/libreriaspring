package com.distribuida.entities;

public class FacturaDetalle {
    private int idFacturaDetalle;
    private int Cantidad;
    private Float Subtotal;

    private Factura factura;
    private Libro libro;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int idFacturaDetalle, int cantidad, Float subtotal) {
        this.idFacturaDetalle = idFacturaDetalle;
        Cantidad = cantidad;
        Subtotal = subtotal;
        factura = factura;
        libro = libro;
    }

    public int getIdFacturaDetalle() {
        return idFacturaDetalle;
    }

    public void setIdFacturaDetalle(int idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Float subtotal) {
        Subtotal = subtotal;
    }

    //GETTER AND SETTER DE LAS DEPENDENCIAS

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    //GETTER AND SETTER DE LAS DEPENDENCIAS

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idFacturaDetalle=" + idFacturaDetalle +
                ", Cantidad=" + Cantidad +
                ", Subtotal=" + Subtotal +
                ", Factura=" + factura+
                ", Libro=" + libro+
                '}';
    }
}
