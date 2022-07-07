package ru.netology.domain;

public class Movies {
    private String name;
    private String genre;
    private int id;

    public Movies(String name, String genre, int id) {
        this.name = name;
        this.genre = genre;
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
