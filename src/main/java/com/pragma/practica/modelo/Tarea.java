package com.pragma.practica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descripcion;

    @ManyToMany
    private List<Usuario> usuariosAsignados;

    @ManyToOne
    private Proyecto proyecto;


    public Tarea() {
    }

    public Tarea(Long id, String titulo, String descripcion, List<Usuario> usuariosAsignados, Proyecto proyecto) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.usuariosAsignados = usuariosAsignados;
        this.proyecto = proyecto;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Usuario> getUsuariosAsignados() {
        return usuariosAsignados;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUsuariosAsignados(List<Usuario> usuariosAsignados) {
        this.usuariosAsignados = usuariosAsignados;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
