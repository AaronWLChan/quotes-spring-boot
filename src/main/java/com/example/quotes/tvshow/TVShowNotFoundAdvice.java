package com.example.quotes.tvshow;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TVShowNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(TVShowNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String tvShowNotFoundHandler(TVShowNotFoundException e){
        return e.getMessage();
    }
}
