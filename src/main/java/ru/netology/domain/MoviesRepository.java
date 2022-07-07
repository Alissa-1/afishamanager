package ru.netology.domain;

public class MoviesRepository {
    protected Movies[] movies = new Movies[0];

    public Movies[] findAll() {
        return movies;
    }
}
