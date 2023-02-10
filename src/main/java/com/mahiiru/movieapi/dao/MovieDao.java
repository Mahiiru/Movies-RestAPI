package com.mahiiru.movieapi.dao;


import com.mahiiru.movieapi.models.Movie;

import java.util.List;

public interface MovieDao {

    List<Movie> getMovies();

    Movie getMovieByID(Long id);
}
