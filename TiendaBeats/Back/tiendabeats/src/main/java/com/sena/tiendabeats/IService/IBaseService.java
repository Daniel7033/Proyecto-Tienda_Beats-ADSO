package com.sena.tiendabeats.IService;

import java.util.List;
import java.util.Optional;

import com.sena.tiendabeats.Entity.ABaseEntity;

public interface IBaseService<T extends ABaseEntity>{
    List<T> all() throws Exception; //Listado que muestra todos los datos de las entidades
    List<T> findByStatusTrue() throws Exception; //Lisatdo que muestra los datos con status verdadero
    Optional<T> findById(Long id) throws Exception; //Listado que muestra los datos buscados por su id
    T save(T entity) throws Exception; //Metodo de guardado en la base de datos por entidad
    void update(Long id, T entity) throws Exception; //Metodo de actualización de datos encontrado por id y entidad 
    void delete(Long id) throws Exception; //Metodo de dato eliminado buscado por id
}
