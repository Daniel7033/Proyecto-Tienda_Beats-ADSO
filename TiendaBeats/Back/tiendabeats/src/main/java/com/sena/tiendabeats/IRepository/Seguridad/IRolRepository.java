package com.sena.tiendabeats.IRepository.Seguridad;

import org.springframework.stereotype.Repository;

import com.sena.tiendabeats.Entity.Seguridad.Rol;
import com.sena.tiendabeats.IRepository.IBaseRepository;

@Repository
public interface IRolRepository extends IBaseRepository<Rol, Long>{
    
}
