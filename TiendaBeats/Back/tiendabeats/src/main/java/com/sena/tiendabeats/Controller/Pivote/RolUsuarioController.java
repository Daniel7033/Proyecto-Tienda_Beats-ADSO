package com.sena.tiendabeats.Controller.Pivote;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Entity.Pivote.RolUsuario;
import com.sena.tiendabeats.IService.Pivote.IRolUsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rol-usuario")
public class RolUsuarioController extends ABaseController<RolUsuario, IRolUsuarioService>{
    public RolUsuarioController(IRolUsuarioService service){
        super(service, "RolUsuario");
    }    
}
