package com.sena.tiendabeats.Service.Seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.tiendabeats.Entity.Seguridad.Modulo;
import com.sena.tiendabeats.IRepository.IBaseRepository;
import com.sena.tiendabeats.IRepository.Seguridad.IModuloRespository;
import com.sena.tiendabeats.IService.Seguridad.IModuloService;
import com.sena.tiendabeats.Service.ABaseService;

@Service
public class ModuloService extends ABaseService<Modulo> implements IModuloService{
    @Autowired
    private IModuloRespository respositorio;

    @Override
    public IBaseRepository<Modulo, Long> getRepository() {
        return respositorio;
    }
}
