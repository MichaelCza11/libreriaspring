package com.distribuida.entities;

public class Categoria {
    private int idCategoria;
    private String Categoria;
    private String Descripcion;

    public Categoria() {
    }

    public Categoria(int idCategoria, String categoria, String descripcion) {
        this.idCategoria = idCategoria;
        Categoria = categoria;
        Descripcion = descripcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", Categoria='" + Categoria + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
