package com.sena.tiendabeats.Service.Seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Seguridad.IRolRepository;
import com.sena.tiendabeats.IService.Seguridad.IRolService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class RolService extends ABaseService<Rol> implements IRolService{
    @Autowired
    private IRolRepository repositorio;

    @Override
    public IBaseRepository<Rol, Long> getRepository() { 
        return repositorio; 
    }
}
