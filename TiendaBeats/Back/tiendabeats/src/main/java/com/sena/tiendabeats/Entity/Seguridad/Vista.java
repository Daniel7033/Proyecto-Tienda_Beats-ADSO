package com.sena.tiendabeats.Entity.Seguridad;

import com.sena.tiendabeats.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vista")
public class Vista extends ABaseEntity{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ruta")
    private String ruta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "modulo_id")
    private Modulo modulo;

    //Getter
    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getRuta(){
        return ruta;
    }

    public Modulo getModulo(){
        return modulo;
    }

    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setRuta(String ruta){
        this.ruta = ruta;
    }

    public void setModulo(Modulo modulo){
        this.modulo = modulo;
    }
}
