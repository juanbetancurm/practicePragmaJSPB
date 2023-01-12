package com.pragma.practica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String correo;

    @ManyToMany
    private List<Tarea> tareasAsignadas;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, List<Tarea> tareasAsignadas) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.tareasAsignadas = tareasAsignadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(List<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }
}
