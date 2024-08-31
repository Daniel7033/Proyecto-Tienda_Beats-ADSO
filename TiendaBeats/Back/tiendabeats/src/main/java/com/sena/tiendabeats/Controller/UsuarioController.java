package com.sena.tiendabeats.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Entity.Usuario;
import com.sena.tiendabeats.IService.IUsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController extends ABaseController<Usuario, IUsuarioService>{
    public UsuarioController(IUsuarioService service){
        super(service, "Usuario");
    }

    //...
}
