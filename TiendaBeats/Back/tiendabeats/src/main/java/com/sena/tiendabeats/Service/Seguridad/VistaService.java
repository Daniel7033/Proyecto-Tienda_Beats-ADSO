package com.sena.tiendabeats.Service.Seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Seguridad.Vista;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Seguridad.IVistaRepository;
import com.sena.tiendabeats.IService.Seguridad.IVistaService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class VistaService extends ABaseService<Vista> implements IVistaService{
    @Autowired
    private IVistaRepository repository;

    @Override
    public IBaseRepository<Vista, Long> getRepository(){
        return repository;
    }
}
