package ru.netology.domain;

public class MoviesRepository {
    private Movies[] movies = new Movies[0];

    public Movies[] findAll() {
        return movies;
    }

    public void add(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies findById(int id) {
        for (Movies movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
    public void removeById(int id) {
        Movies[] tmp = new Movies[movies.length - 1];
        int copyToIndex = 0;
        for (Movies movie : movies) {
            if (movie.getId() != id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
            movies = tmp;
        }
    }

    public void removeAll() {
        Movies[] empty = {};
        movies = empty;
    }
}

