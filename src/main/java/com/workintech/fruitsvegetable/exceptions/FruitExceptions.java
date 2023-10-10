package com.workintech.fruitsvegetable.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class FruitExceptions extends RuntimeException{


    private HttpStatus status;

    public FruitExceptions(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
