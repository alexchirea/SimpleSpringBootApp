package com.alexchirea.SimpleSpringBootApp.repository;

import com.alexchirea.SimpleSpringBootApp.model.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SongsRepositoryUnitTest {

    private SongsRepository songsRepository;

    private boolean isReady = false;

    @BeforeEach
    void setUp() {
        if (isReady) return;
        songsRepository = new SongsRepository();
        isReady = true;
    }

    @Test
    void shouldReturnAllSongs() {
        // act
        List<Song> songs = songsRepository.getAll();

        // assert
        assertThat(songs.size()).isEqualTo(3);
    }

    @Test
    void shouldReturnAllSongsByYear() {
        // act
        List<Song> songs1978 = songsRepository.getAllByYear(1978);
        List<Song> songs1977 = songsRepository.getAllByYear(1977);
        List<Song> songs2020 = songsRepository.getAllByYear(2020);

        // assert
        assertThat(songs1977.size()).isEqualTo(1);
        assertThat(songs1978.size()).isEqualTo(2);
        assertThat(songs2020.size()).isEqualTo(0);
    }

}