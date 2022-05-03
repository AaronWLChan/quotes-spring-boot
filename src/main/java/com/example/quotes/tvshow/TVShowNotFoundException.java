package com.example.quotes.tvshow;

public class TVShowNotFoundException extends RuntimeException{
    public TVShowNotFoundException(Long id) {
        super("TV Show with id: " + id + " not found.");
    }
}
