package com.git.clase.modelo;

public class Usuario {


    private Long Id;

    private String nombre;

    public Usuario() {
    }

    public Usuario(Long id, String nombre) {
        Id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
