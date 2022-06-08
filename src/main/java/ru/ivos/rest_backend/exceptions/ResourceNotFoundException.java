package ru.ivos.rest_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author iVos 31.05.2022
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
