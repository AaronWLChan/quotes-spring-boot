package com.example.quotes.character;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CharacterNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(CharacterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String characterNotFoundHandler(CharacterNotFoundException e){
        return e.getMessage();
    }
}
