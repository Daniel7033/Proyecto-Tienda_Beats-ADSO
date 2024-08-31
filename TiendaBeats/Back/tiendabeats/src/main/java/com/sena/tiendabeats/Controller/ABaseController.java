package com.sena.tiendabeats.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sena.tiendabeats.Dto.ApiResponseDto;
import com.sena.tiendabeats.Entity.ABaseEntity;
import com.sena.tiendabeats.IService.IBaseService;

public class ABaseController<T extends ABaseEntity, S extends IBaseService<T>>{
    protected S service;
    protected String entity;

    protected ABaseController(S service, String entity){
        this.service = service;
        this.entity = entity;
    }

    @GetMapping
    public ResponseEntity<ApiResponseDto<List<T>>> findByStatusTrue(){
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<T>>("Datos obtenidos", service.findByStatusTrue(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<T>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDto<Optional<T>>> show(@PathVariable Long id){
        try {
            Optional<T> entity = service.findById(id);
            return ResponseEntity.ok(new ApiResponseDto<Optional<T>>("Dato encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<Optional<T>>(e.getMessage(), null, false));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponseDto<T>> save(@RequestBody T entity){
        try {
            return ResponseEntity.ok(new ApiResponseDto<T>("Guradado con éxito", service.save(entity), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<ApiResponseDto<T>> update(@PathVariable Long id, @RequestBody T entity){
        try {
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDto<T>("Actualizado correctamente", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiResponseDto<T>> delete(@PathVariable Long id){
        try {
            service.delete(id);
            return ResponseEntity.ok(new ApiResponseDto<T>("Eliminado", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
        }
    }
}
