package com.mahiiru.movieapi.controllers;


import com.mahiiru.movieapi.dao.MovieDao;
import com.mahiiru.movieapi.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {


    @Autowired
    private MovieDao movieDao;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieDao.getMovies());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieDao.getMovieByID(id));
    }
}
