package com.sena.tiendabeats.Controller.Seguridad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Entity.Seguridad.Vista;
import com.sena.tiendabeats.IService.Seguridad.IVistaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vistas")
public class VistaController extends ABaseController<Vista, IVistaService>{
    public VistaController(IVistaService service){
        super(service, "Vista");
    }
}
