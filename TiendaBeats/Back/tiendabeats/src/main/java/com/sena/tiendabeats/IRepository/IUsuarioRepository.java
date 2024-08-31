package com.sena.tiendabeats.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.tiendabeats.Entity.Usuario;

@Repository
public interface IUsuarioRepository extends IBaseRepository<Usuario, Long>{
    
}
