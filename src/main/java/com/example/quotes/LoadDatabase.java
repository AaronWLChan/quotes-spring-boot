package com.example.quotes;

import com.example.quotes.character.Character;
import com.example.quotes.character.CharacterRepository;
import com.example.quotes.quote.Quote;
import com.example.quotes.quote.QuoteRepository;
import com.example.quotes.tvshow.TVShow;
import com.example.quotes.tvshow.TVShowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(QuoteRepository quoteRepository, CharacterRepository characterRepository, TVShowRepository tvShowRepository) {

        return args -> {

            log.info("Preloading...");

            Character character = characterRepository.save(new Character("Huell Babineaux"));

            TVShow tvShow = tvShowRepository.save(new TVShow("Breaking Bad", new ArrayList<>(List.of(character))));

            quoteRepository.save(new Quote("Reasonably.", character, 4, 11, tvShow));

            log.info("Preloaded.");
        };
    }
}
