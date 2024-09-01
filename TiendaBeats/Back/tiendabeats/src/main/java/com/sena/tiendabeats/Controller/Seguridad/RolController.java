package com.sena.tiendabeats.Controller.Seguridad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.Service.Seguridad.RolService;

import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin("*")
@RestController
@RequestMapping("/roles")
public class RolController extends ABaseController<Rol, RolService>{
    public RolController(RolService service){
        super(service, "Rol");
    }
}
