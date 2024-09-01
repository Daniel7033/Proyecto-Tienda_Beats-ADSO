package com.sena.tiendabeats.IRepository.Seguridad;

import org.springframework.stereotype.Repository;

import com.sena.tiendabeats.Entity.Seguridad.Modulo;
import com.sena.tiendabeats.IRepository.IBaseRepository;

@Repository
public interface IModuloRespository extends IBaseRepository<Modulo, Long>{
    
}
