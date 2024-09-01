package com.sena.tiendabeats.Entity.Pivote;

import com.sena.tiendabeats.Entity.ABaseEntity;
import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.Entity.Seguridad.Vista;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_vista")
public class RolVista extends ABaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id",  nullable = false)
    private Rol rol;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vista_id",  nullable = false)
    private Vista vista;

    //Getter
    public Rol getRol() {
        return rol;
    }

    public Vista getVista(){
        return vista;
    }

    //Setter
    public void setRol(Rol rol){
        this.rol = rol;
    }

    public void setVista(Vista vista){
        this.vista = vista;
    }
}
