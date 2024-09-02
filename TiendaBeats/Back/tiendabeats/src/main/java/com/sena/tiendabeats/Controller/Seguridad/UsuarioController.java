package com.sena.tiendabeats.Controller.Seguridad;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.tiendabeats.Controller.ABaseController;
import com.sena.tiendabeats.Dto.ILoginDto;
import com.sena.tiendabeats.Dto.LoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IService.Seguridad.IUsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController extends ABaseController<Usuario, IUsuarioService> {
    public UsuarioController(IUsuarioService service) {
        super(service, "Usuario");
    }

    // ...
    @PostMapping("/login")
    public ResponseEntity<List<ILoginDto>> login(@RequestBody LoginDto login) {
        try {
            return ResponseEntity.ok(service.Login(login.getUsername(), login.getPassword()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }

}
