package ru.netology.domain;

public class MoviesManager {
    MoviesRepository repo = new MoviesRepository();
    protected int limit = 10;

    public MoviesManager(MoviesRepository repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public MoviesManager(MoviesRepository repo) {
        this.repo = repo;
    }

    public Movies[] findAll() {
        return repo.findAll();
    }

    public Movies[] findLast() {
        Movies[] movies = repo.findAll();
        int resultLength;

        if (movies.length < limit) {
            resultLength = repo.findAll().length;
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
