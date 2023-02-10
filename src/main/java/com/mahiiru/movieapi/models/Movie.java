package com.mahiiru.movieapi.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {

    @Id
    @Column(name = "movie_id")
    private Long movie_id;

    @Column(name = "movie_poster_link")
    private String movie_poster_link;

    @Column(name = "movie_series_title")
    private String movie_series_title;

    @Column(name = "movie_released_year")
    private int movie_released_year;

    @Column(name = "movie_certificate")
    private String movie_certificate;

    @Column(name = "movie_runtime")
    private String movie_runtime;

    @Column(name = "movie_genre")
    private String movie_genre;

    @Column(name = "movie_imdb_rating")
    private float movie_imdb_rating;

    @Column(name = "movie_overview")
    private String movie_overview;

    @Column(name = "movie_meta_score")
    private int movie_meta_score;

    @Column(name = "movie_director")
    private String movie_director;

    @Column(name = "movie_star1")
    private String movie_star1;

    @Column(name = "movie_star2")
    private String movie_star2;

    @Column(name = "movie_star3")
    private String movie_star3;

    @Column(name = "movie_star4")
    private String movie_star4;

    @Column(name = "movie_no_of_votes")
    private Long movie_no_of_votes;

    @Column(name = "movie_gross")
    private String movie_gross;

}
