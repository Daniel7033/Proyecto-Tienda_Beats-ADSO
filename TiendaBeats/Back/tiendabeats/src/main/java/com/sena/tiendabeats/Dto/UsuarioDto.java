package com.sena.tiendabeats.Dto;

import java.time.LocalDate;

public interface UsuarioDto extends IGenericDto{
    String getNombre();
    String getApellido();
    String getEmail();
    String getTelefono();
    String getUsername();
    String getPassword();
    LocalDate getFechaNac();
}
