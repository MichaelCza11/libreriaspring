package com.distribuida.entities;

import java.util.Date;

public class Libro {
    private int idLibro;
    private String Titulo;
    private String Editorial;
    private int NumPaginas;
    private String Edicion;
    private String Idioma;
    //private Date FechaPublicacion;
    private String Descripcion;
    private String TipoPasta;
    private String  Isbn;
    private int NumEjemplares;
    private String Portada;
    private String Presetacion;
    private String Precio;

    private Categoria categoria;
    private Autor autor;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma /*,Date fechaPublicacion*/, String descripcion, String tipoPasta, String isbn, int numEjemplares, String portada, String presetacion, String precio) {
        this.idLibro = idLibro;
        Titulo = titulo;
        Editorial = editorial;
        NumPaginas = numPaginas;
        Edicion = edicion;
        Idioma = idioma;
        //FechaPublicacion = fechaPublicacion;
        Descripcion = descripcion;
        TipoPasta = tipoPasta;
        Isbn = isbn;
        NumEjemplares = numEjemplares;
        Portada = portada;
        Presetacion = presetacion;
        Precio = precio;
        categoria = categoria;
        autor = autor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String edicion) {
        Edicion = edicion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }

    /*
    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }
    */
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipoPasta() {
        return TipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        TipoPasta = tipoPasta;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public int getNumEjemplares() {
        return NumEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        NumEjemplares = numEjemplares;
    }

    public String getPortada() {
        return Portada;
    }

    public void setPortada(String portada) {
        Portada = portada;
    }

    public String getPresetacion() {
        return Presetacion;
    }

    public void setPresetacion(String presetacion) {
        Presetacion = presetacion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    //GETTER AND SETTER DEPENDENCIAS

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //GETTER AND SETTER DEPENDENCIAS
    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", Titulo='" + Titulo + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", NumPaginas=" + NumPaginas +
                ", Edicion='" + Edicion + '\'' +
                ", Idioma='" + Idioma + '\'' +
              //  ", FechaPublicacion=" + FechaPublicacion +
                ", Descripcion='" + Descripcion + '\'' +
                ", TipoPasta='" + TipoPasta + '\'' +
                ", Isbn='" + Isbn + '\'' +
                ", NumEjemplares=" + NumEjemplares +
                ", Portada='" + Portada + '\'' +
                ", Presetacion='" + Presetacion + '\'' +
                ", Precio=" + Precio +
                ", Categoria=" + categoria +
                ", Autor=" + autor +
                '}';
    }
}
