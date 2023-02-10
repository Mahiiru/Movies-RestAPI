package com.mahiiru.movieapi.dao;


import com.mahiiru.movieapi.models.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MovieDaoImp implements MovieDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Movie> getMovies() {
        String query = "FROM Movie";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Movie getMovieByID(Long id) {
        return entityManager.find(Movie.class,id);
    }
}
