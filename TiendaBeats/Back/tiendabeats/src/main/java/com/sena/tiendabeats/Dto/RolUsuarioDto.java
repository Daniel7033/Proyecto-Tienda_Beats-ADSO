package com.sena.tiendabeats.Dto;

import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;

public interface RolUsuarioDto extends IGenericDto{
    Rol getRol();
    Usuario getUsuario();
}
