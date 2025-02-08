package com.moviemanagement.movieAPI.repositories;

import com.moviemanagement.movieAPI.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie , Integer> {

}
