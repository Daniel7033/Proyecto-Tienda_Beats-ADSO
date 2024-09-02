package com.sena.tiendabeats.Dto;

public interface ILoginDto {
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
