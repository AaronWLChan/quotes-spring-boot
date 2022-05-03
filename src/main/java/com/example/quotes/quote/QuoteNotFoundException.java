package com.example.quotes.quote;

public class QuoteNotFoundException extends RuntimeException{

    public QuoteNotFoundException() {
        super("Quote could not be found");
    }

    public QuoteNotFoundException(Long id) {
        super("Quote with id: " + id + " not found.");
    }
}
