package com.sena.tiendabeats.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private Boolean status;

    //Encapsulamiento
    //Getter
    public Long getId(){
        return id;
    }

    public Boolean getStatus(){
        return status;
    }
    //Setter
    public void setId(Long id){
        this.id = id;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }
}
