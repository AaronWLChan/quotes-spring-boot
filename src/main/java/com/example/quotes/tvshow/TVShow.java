package com.example.quotes.tvshow;

import com.example.quotes.character.Character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class TVShow {

    @Id @GeneratedValue
    private Long id;

    private String name;

    //TV Show has many characters (1:M)
    @OneToMany
    private List<Character> characters;

    public TVShow() {
    }

    public TVShow(String name, List<Character> characters) {
        this.name = name;
        this.characters = characters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
