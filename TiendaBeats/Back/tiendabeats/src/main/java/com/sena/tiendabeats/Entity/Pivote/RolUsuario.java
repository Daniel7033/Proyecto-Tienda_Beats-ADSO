package com.sena.tiendabeats.Entity.Pivote;

import com.sena.tiendabeats.Entity.ABaseEntity;
import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class RolUsuario extends ABaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    //Getter
    public Rol getRol(){
        return rol;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    //Setter
    public void setRol(Rol rol){
        this.rol = rol;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
