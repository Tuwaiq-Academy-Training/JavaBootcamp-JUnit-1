package com.example.springsecuritybootcamp.ApiResponse;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }
}
