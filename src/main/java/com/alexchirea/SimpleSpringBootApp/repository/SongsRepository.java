package com.alexchirea.SimpleSpringBootApp.repository;

import com.alexchirea.SimpleSpringBootApp.model.Song;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SongsRepository {

    private static List<Song> songs = Arrays.asList(
            new Song("Miss You", "The Rolling Stones", 1978),
            new Song("Running on Empty", "Jackson Browne", 1977),
            new Song("I Will Survive", "Gloria Gaynor", 1978)
    );

    public List<Song> getAll() {
        return songs;
    }

    public List<Song> getAllByYear(int iYear) {
        return songs.stream().filter(song -> song.getReleaseYear() == iYear).collect(Collectors.toList());
    }

}
