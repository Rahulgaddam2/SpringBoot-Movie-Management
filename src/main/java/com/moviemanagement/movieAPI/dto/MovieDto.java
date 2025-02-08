package com.moviemanagement.movieAPI.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private Integer movieId;


    @NotBlank(message = "Movie title is Mandatory")
    private String title;


    @NotBlank(message = "director name is Mandatory")
    private String director;


    @NotBlank(message = "Movie studio is Mandatory")
    private String studio;


    private Set<String> movieCast;


    private Integer releaseYear;

    @NotBlank(message = "poster is mandatory")
    private String poster;

    @NotBlank(message = "poster url is mandatory")
    private String posterUrl;
}
