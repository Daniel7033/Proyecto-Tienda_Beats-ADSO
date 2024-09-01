package com.sena.tiendabeats.Controller.Seguridad;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Dto.LoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IService.Seguridad.IUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController extends ABaseController<Usuario, IUsuarioService> {
    public UsuarioController(IUsuarioService service) {
        super(service, "Usuario");
    }

    // ...
    @GetMapping("/login")
    public ResponseEntity<List<LoginDto>> login(@RequestParam String username, @RequestParam String password) {
        try {
            return ResponseEntity.ok(service.Login(username, password));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

}
