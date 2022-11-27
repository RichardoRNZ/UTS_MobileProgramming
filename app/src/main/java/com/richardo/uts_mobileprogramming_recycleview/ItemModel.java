package com.richardo.uts_mobileprogramming_recycleview;

public class ItemModel {
   private  String name,year;
   private int Movie;
    public ItemModel(String name, String year, int movie) {
        this.name = name;
        this.year = year;
        Movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMovie() {
        return Movie;
    }

    public void setMovie(int movie) {
        Movie = movie;
    }
}
