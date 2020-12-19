package com.alexchirea.SimpleSpringBootApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    private String title;
    private String author;
    private Integer releaseYear;

}
