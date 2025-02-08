package com.moviemanagement.movieAPI.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId; // we have taken Integer because Integer default value is null , int (primitive type) default value is 0

    @Column(nullable = false , length = 180)
    @NotBlank(message = "Movie title is Mandatory")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "director name is Mandatory")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Movie studio is Mandatory")
    private String studio;

    @ElementCollection // stores a collection of primitive objects in a separate table.
    @CollectionTable(name = "movie_cast") // defines the table name and foreign key relationship.
    private Set<String> movieCast;

    @Column(nullable = false)
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "poster is mandatory")
    private String poster;


}
