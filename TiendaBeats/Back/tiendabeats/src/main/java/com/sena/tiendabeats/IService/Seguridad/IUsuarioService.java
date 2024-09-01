package com.sena.tiendabeats.IService.Seguridad;

import java.util.List;
import java.util.Optional;

import com.sena.tiendabeats.Dto.LoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IService.IBaseService;

public interface IUsuarioService extends IBaseService<Usuario>{
    //Login
    List<LoginDto> Login(String username, String password);
}
