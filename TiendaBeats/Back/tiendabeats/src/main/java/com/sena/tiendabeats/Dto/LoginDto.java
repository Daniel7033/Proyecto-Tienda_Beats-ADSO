package com.sena.tiendabeats.Dto;

public interface LoginDto {
    //lOGIN {
        String getUsername();
        String getPassword();
    //}
    //MENU{
        String getModulo();
        String getFormulario();
    //}
    
    Boolean getStatus();
}
