package com.alexchirea.SimpleSpringBootApp.controller;

import com.alexchirea.SimpleSpringBootApp.repository.SongsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/songs")
public class SongsController {

    private SongsRepository songsRepository;

    public SongsController() {
        this.songsRepository = new SongsRepository();
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(songsRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("/year/{year}")
    public ResponseEntity<?> getAllByYear(@PathVariable("year") Integer year) {
        return new ResponseEntity<>(songsRepository.getAllByYear(year), HttpStatus.OK);
    }

}
