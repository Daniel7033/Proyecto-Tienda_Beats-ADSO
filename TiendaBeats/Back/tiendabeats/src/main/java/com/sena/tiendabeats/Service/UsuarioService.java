package com.sena.tiendabeats.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Usuario;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.IUsuarioRepository;
import com.sena.tiendabeats.IService.IUsuarioService;

@Service
public class UsuarioService extends ABaseService<Usuario> implements IUsuarioService{
    
    @Autowired
    private IUsuarioRepository repositorio;

    @Override
    protected IBaseRepository<Usuario, Long> getRepository(){
        return repositorio;
    }
}
