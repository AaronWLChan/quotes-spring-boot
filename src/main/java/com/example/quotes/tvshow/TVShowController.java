package com.example.quotes.tvshow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tv_shows")
public class TVShowController {

    private final TVShowRepository repository;

    public TVShowController(TVShowRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    List<TVShow> get(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    TVShow getOne(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new TVShowNotFoundException(id));
    }


}
