package com.sena.tiendabeats.Service.Pivote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Pivote.RolVista;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Pivote.IRolVistaRepository;
import com.sena.tiendabeats.IService.Pivote.IRolVistaService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class RolVistaService extends ABaseService<RolVista> implements IRolVistaService{
    @Autowired
    private IRolVistaRepository repository;

    @Override
    public IBaseRepository<RolVista, Long> getRepository(){
        return repository;
    }
}
