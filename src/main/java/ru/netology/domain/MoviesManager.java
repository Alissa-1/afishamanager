package ru.netology.domain;

public class MoviesManager {
    protected Movies[] movies = new Movies[0];
    protected int limit;

    public Movies[] findAll() {
        return movies;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {
        limit = 10;
    }

    public void add(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findLast() {
        int resultLength;

        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        Movies[] ans = new Movies[resultLength];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
