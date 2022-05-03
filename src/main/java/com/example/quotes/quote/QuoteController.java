package com.example.quotes.quote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController()
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteRepository repository;

    public QuoteController(QuoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Quote> get(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Quote getOne(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new QuoteNotFoundException(id));
    }

    @GetMapping("/random")
    Quote random(){

        //If there are quotes...
        if (repository.count() > 0){

            List<Quote> quotes = repository.findAll();

            int index = new Random().nextInt(quotes.size());

            return quotes.get(index);
        }

        //No quotes therefore throw
        else {
            throw new QuoteNotFoundException();
        }

    }

}
