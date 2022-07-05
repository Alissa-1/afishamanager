package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MoviesManagerTest {
    public String movie1 = "First";
    public String movie2 = "Second";
    public String movie3 = "Third";
    public String movie4 = "Fourth";
    public String movie5 = "Fifth";
    public String movie6 = "Sixth";
    public String movie7 = "Seventh";
    public String movie8 = "Eighth";
    public String movie9 = "Ninth";
    public String movie10 = "Tenth";
    public String movie11 = "Eleventh";
    public String movie12 = "Tvelfth";

    @Test
    public void shouldAddNoMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(null); // подойдет ли ""?
        String[] expected = {null};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        String[] expected = {"First"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = { movie1, movie2, movie3 };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnTenLastOfTvelveIfDefault() {
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


        String[] expected = { movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3 };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnTenLastOfTvelveIfDefaultAndEqual() {
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

        String[] expected = {movie1, movie1, movie1, movie1, movie1, movie1, movie1, movie1,
                movie1, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
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

        String[] expected = { movie10, movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2, movie1  };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
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

        String[] expected = { movie9, movie8, movie7, movie6,
                movie5, movie4, movie3, movie2, movie1  };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldReturnNoneOfEmptyStorageIfDefault() {
//        MoviesManager manager = new MoviesManager();
//
//        String[] expected = {""}; // непонятно, как сравнивать пустые значения
//        String[] actual = manager.findLast();
//
//        assertArrayEquals(expected, actual);
//    }

    @Test
    public void shouldReturnNineLastOfTvelve() {
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


        String[] expected = { movie12, movie11, movie10, movie9, movie8, movie7, movie6,
                movie5, movie4 };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneLastOfTvelve() {
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


        String[] expected = { movie12 };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNoneLastOfTvelve() {
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

        String[] empty = new String[0];
        String[] expected = empty;
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}
