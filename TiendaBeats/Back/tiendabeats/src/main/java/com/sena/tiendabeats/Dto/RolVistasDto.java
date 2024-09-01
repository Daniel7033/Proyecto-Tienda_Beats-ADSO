package com.sena.tiendabeats.Dto;

import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.Entity.Seguridad.Vista;

public interface RolVistasDto extends IGenericDto{
    Rol getRol();
    Vista  getVista();
}
