package com.example.quotes.character;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException(Long id) {
        super("Character with id: " + id  + " not found.");
    }
}
