package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MoviesManagerTest {
    MoviesRepository repo = Mockito.mock(MoviesRepository.class);

    public Movies movie1 = new Movies("n1", "g1", 1);
    public Movies movie2 = new Movies("n2", "g2", 2);
    public Movies movie3 = new Movies("n3", "g3", 3);
    public Movies movie4 = new Movies("n4", "g4", 4);
    public Movies movie5 = new Movies("n5", "g5", 5);
    public Movies movie6 = new Movies("n6", "g6", 6);
    public Movies movie7 = new Movies("n7", "g7", 7);
    public Movies movie8 = new Movies("n8", "g8", 8);
    public Movies movie9 = new Movies("n9", "g9", 9);
    public Movies movie10 = new Movies("n10", "g10", 10);
    public Movies movie11 = new Movies("n11", "g11", 11);
    public Movies movie12 = new Movies("n12", "g12", 12);

    @Test
    public void shouldFindAllWithMockito() {
        MoviesManager manager = new MoviesManager(repo);
        Movies[] movies = { movie1, movie2, movie3 };

        doReturn(movies).when(repo).findAll();

        Movies[] expected = { movie1, movie2, movie3 };
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithMockito() {
        MoviesManager manager = new MoviesManager(repo, 1);
        Movies[] movies = { movie1, movie2, movie3 };

        doReturn(movies).when(repo).findAll();

        Movies[] expected = {movie3};
        Movies[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}
