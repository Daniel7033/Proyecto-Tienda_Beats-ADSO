package com.sena.tiendabeats.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Modulo;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.IModuloRespository;
import com.sena.tiendabeats.IService.IModuloService;

@Service
public class ModuloService extends ABaseService<Modulo> implements IModuloService{
    @Autowired
    private IModuloRespository respositorio;

    @Override
    public IBaseRepository<Modulo, Long> getRepository() {
        return respositorio;
    }
}
