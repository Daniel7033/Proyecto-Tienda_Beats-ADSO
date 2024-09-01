package com.sena.tiendabeats.Controller.Pivote;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Entity.Pivote.RolVista;
import com.sena.tiendabeats.IService.Pivote.IRolVistaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rol-vista")
public class RolVistaController extends ABaseController<RolVista, IRolVistaService>{
    public RolVistaController(IRolVistaService service){
        super(service, "RolVista");
    }
}
