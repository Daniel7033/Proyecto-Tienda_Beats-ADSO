package com.sena.tiendabeats.Dto;

import com.sena.tiendabeats.Entity.Seguridad.Modulo;

public interface VistaDto extends IGenericDto{
    String getNombre();
    String getDescripcion();
    String getRuta();
    Modulo getModulo();
}
