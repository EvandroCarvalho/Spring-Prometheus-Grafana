package com.example.metrics.resources;

import com.example.metrics.entity.Author;
import com.example.metrics.entity.Manga;
import com.example.metrics.repository.AuthorsRepository;
import com.example.metrics.repository.MangasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/mangas", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MangasController {

    private final AuthorsRepository authorsRepository;
    private final MangasRepository mangasRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private Iterable<Manga> getAllMangas() {
        return mangasRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Manga saveManga(@RequestBody Manga manga) {
        return mangasRepository.save(manga);
    }

    @GetMapping(path = "/authors")
    @ResponseStatus(HttpStatus.OK)
    private Iterable<Author> getAllAuthors() {
        return authorsRepository.findAll();
    }

    @PostMapping(path = "/authors")
    @ResponseStatus(HttpStatus.CREATED)
    private Author saveAuthor(@RequestBody Author author) {
        return authorsRepository.save(author);
    }

}
