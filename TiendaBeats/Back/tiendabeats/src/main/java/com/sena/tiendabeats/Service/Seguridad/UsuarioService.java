package com.sena.tiendabeats.Service.Seguridad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Dto.ILoginDto;
import com.sena.tiendabeats.Entity.Seguridad.Usuario;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Seguridad.IUsuarioRepository;
import com.sena.tiendabeats.IService.Seguridad.IUsuarioService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class UsuarioService extends ABaseService<Usuario> implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    protected IBaseRepository<Usuario, Long> getRepository() {
        return repository;
    }

    @Override
    public List<ILoginDto> Login(String username, String password) {
        if (username != null && password != null) {
            return repository.getLogin(username, password);
        } else {
            return null;
        }
    }

}
