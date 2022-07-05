package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;


public class MoviesManagerTest {
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
    public void shouldAddNoMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(null); // подойдет ли ""?
        Movies[] expected = {null};
        Movies[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie12);

        Movies[] actual = manager.findAll();

        Movies addedOne = new Movies("n1", "g1", 1);

        Movies[] expected = {addedOne};

        Objects.equals(expected, actual);

        expected.equals(actual); // не понимаю, как нужно сравнивать

    }

    @Test
    public void shouldAddThreeMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        Movies[] expected = { movie1, movie2, movie3 };
        Movies[] actual = manager.findAll();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnTenLastOfTwelveIfDefault() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);


        Movies[] expected = { movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3 };
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnTenLastOfTwelveIfDefaultAndEqual() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);
        manager.add(movie1);

        Movies[] expected = {movie1, movie1, movie1, movie1, movie1, movie1, movie1, movie1,
                movie1, movie1};
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnTenLastOfTenIfDefault() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        Movies[] expected = { movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2, movie1  };
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnAllLastOfNineIfDefault() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);

        Movies[] expected = { movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2, movie1  };
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnNoneOfEmptyStorageIfDefault() {
        MoviesManager manager = new MoviesManager();

        Movies[] empty = new Movies[0];

        Movies[] expected = empty;
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnNineLastOfTwelve() {
        MoviesManager manager = new MoviesManager(9);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);


        Movies[] expected = { movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4 };
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnOneLastOfTwelve() {
        MoviesManager manager = new MoviesManager(1);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);


        Movies[] expected = { movie12 };
        Movies[] actual = manager.findLast();

        expected.equals(actual); // не понимаю, как нужно сравнивать
    }

    @Test
    public void shouldReturnNoneLastOfTwelve() {
        MoviesManager manager = new MoviesManager(0);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);

        Movies[] empty = new Movies[0];
        Movies[] expected = empty;
        Movies[] actual = manager.findLast();
        expected.equals(actual); // не понимаю, как нужно сравнивать
    }
}
