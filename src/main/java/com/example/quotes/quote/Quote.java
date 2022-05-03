package com.example.quotes.quote;

import com.example.quotes.character.Character;
import com.example.quotes.tvshow.TVShow;

import javax.persistence.*;

@Entity
public class Quote {

    @Id @GeneratedValue
    private Long id;

    private String quote;

    //Quote is unique to each character
    @OneToOne
    private Character character;

    private Integer season;

    private Integer episode;

    //Quote is unique to each TVShow
    @OneToOne
    private TVShow tvShow;

    public Quote() {
    }

    public Quote(String quote, Character character, Integer season, Integer episode, TVShow tvShow) {
        this.quote = quote;
        this.character = character;
        this.season = season;
        this.episode = episode;
        this.tvShow = tvShow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public TVShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TVShow tvShow) {
        this.tvShow = tvShow;
    }
}
