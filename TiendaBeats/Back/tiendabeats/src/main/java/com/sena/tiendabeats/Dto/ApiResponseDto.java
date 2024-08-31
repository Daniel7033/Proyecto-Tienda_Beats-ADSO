package com.sena.tiendabeats.Dto;

public class ApiResponseDto<T>{
    private String message;
    private T data;
    private Boolean status;

    public ApiResponseDto(){
        //Constructor vacío...
    }

    //Constructor con parametros
    public ApiResponseDto(String message, T data, Boolean status){
        this.message = message;
        this.data = data;
        this.status = status;
    }

    //Encapsulamiento
    //Getter
    public String getMessage(){
        return message;
    }

    public T getData(){
        return data;
    }

    public Boolean getStatus(){
        return status;
    }

    //Setter
    public void setMessage(String message){
        this.message = message;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }
}
