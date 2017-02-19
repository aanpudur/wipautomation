package com.wip.training.excercise6;

import java.util.Date;

/*
 * Create a Movie class with title, genre, release date & length of the movie ( int type, in mins)
 * Pass all details through constructor. Create accessor methods for all fields ( getter for all
 * fields) Create a printDetails method, print all details (syso)
 */

public class Movie {

  private String title;
  private String genre;
  private Date releaseDate;
  private int lengthOfMovie;

  Movie(String t, String g, Date rd, int lm) {
    title = t;
    genre = g;
    releaseDate = rd;
    lengthOfMovie = lm;
  }

  // creating accessor methods, to access the values to hide implementation
  public String getTitle() {
    return title;
  }

  public String getGenere() {
    return genre;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public int getlengthOfMovie() {
    return lengthOfMovie;
  }

  // creating moviePrintDetails method

  public void moviePrintDetails() {
    System.out.print("\nName: " + getTitle() + ", ");
    System.out.print("Genere:" + getGenere() + ", ");
    System.out.print("Release date: " + getReleaseDate() + ", ");
    System.out.print("Length of movie: " + getlengthOfMovie() + "\n");

  }


}
