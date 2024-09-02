package com.sena.tiendabeats.IService.Seguridad;

import java.util.List;

import com.sena.tiendabeats.Dto.ILoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IService.IBaseService;

public interface IUsuarioService extends IBaseService<Usuario>{
    //Login
    List<ILoginDto> Login(String username, String password);
}
