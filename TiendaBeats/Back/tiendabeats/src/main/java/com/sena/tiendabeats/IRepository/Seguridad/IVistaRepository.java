package com.sena.tiendabeats.IRepository.Seguridad;

import org.springframework.stereotype.Repository;

import com.sena.tiendabeats.Entity.Seguridad.Vista;
import com.sena.tiendabeats.IRepository.IBaseRepository;

@Repository
public interface IVistaRepository extends IBaseRepository<Vista, Long>{
    
}
