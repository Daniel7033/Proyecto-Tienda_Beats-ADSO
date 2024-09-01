package com.sena.tiendabeats.Service.Pivote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Pivote.RolUsuario;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Pivote.IRolUsuarioRepository;
import com.sena.tiendabeats.IService.Pivote.IRolUsuarioService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class RolUsuarioService extends ABaseService<RolUsuario> implements IRolUsuarioService{
    @Autowired
    private IRolUsuarioRepository repositorio;

    @Override
    public IBaseRepository<RolUsuario, Long> getRepository(){
        return repositorio;
    }
}
