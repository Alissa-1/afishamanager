package ru.netology.domain;

public class MoviesManager {
    protected String[] movies = new String[0];
    protected int limit;

    public int getMoviesNumber() {
        return movies.length;
    }

    public String[] findAll() {
        return movies;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {
        limit = 10;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
            tmp[tmp.length - 1] = movie;
            movies = tmp;
    }

    public String[] findLast() {
        int resultLength;

        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] ans = new String[resultLength];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
