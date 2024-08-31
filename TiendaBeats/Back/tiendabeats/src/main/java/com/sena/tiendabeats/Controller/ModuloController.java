package com.sena.tiendabeats.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Entity.Modulo;
import com.sena.tiendabeats.IService.IModuloService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/modulo")
public class ModuloController extends ABaseController<Modulo, IModuloService>{
    public ModuloController(IModuloService service){
        super(service, "Modulo");
    }
}
