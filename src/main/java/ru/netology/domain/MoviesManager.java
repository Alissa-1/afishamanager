package ru.netology.domain;

public class MoviesManager {
    protected MoviesRepository repo = new MoviesRepository();
    protected int limit = 10;

    public MoviesManager(MoviesRepository repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public MoviesManager(MoviesRepository repo) {
        this.repo = repo;
    }

    public void add(Movies movie) {
        repo.add(movie);
    }

    public Movies[] findAll() {
        return repo.findAll();
    }

    public Movies findById(int id) {
        return repo.findById(id);
    }

    public void removeById(int id) {
       repo.removeById(id);
    }

    public void removeAll() {
        repo.removeAll();
    }

    public Movies[] findLast() {
        Movies[] movies = repo.movies;
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
