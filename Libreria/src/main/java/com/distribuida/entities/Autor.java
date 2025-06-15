package com.distribuida.entities;

public class Autor {
    private int idAutor;
    private String Nombre;
    private String Apellido;
    private String Pais;
    private String Direccion;
    private String Telefono;
    private String Correo;

    public Autor() {
    }

    public Autor(int idAutor, String nombre, String apellido, String pais, String direccion, String telefono, String correo) {
        this.idAutor = idAutor;
        Nombre = nombre;
        Apellido = apellido;
        Pais = pais;
        Direccion = direccion;
        Telefono = telefono;
        Correo = correo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Pais='" + Pais + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Correo='" + Correo + '\'' +
                '}';
    }
}
