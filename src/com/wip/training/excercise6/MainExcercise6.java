package com.wip.training.excercise6;

import java.util.Calendar;
import java.util.Date;

public class MainExcercise6 {

  public static void main(String[] args) {

    Movie[] myMovies = new Movie[5];

    Calendar cal = Calendar.getInstance();

    // built based on the previous homework
    cal.set(2016, Calendar.OCTOBER, 15);
    Date rd1 = cal.getTime();

    cal.set(2013, Calendar.NOVEMBER, 13);
    Date rd2 = cal.getTime();

    cal.set(2007, Calendar.SEPTEMBER, 13);
    Date rd3 = cal.getTime();

    cal.set(2011, Calendar.NOVEMBER, 15);
    Date rd4 = cal.getTime();

    cal.set(2025, Calendar.JANUARY, 13);
    Date rd5 = cal.getTime();

    myMovies[0] = new Movie("Moonlight", "Drama", rd1, 110);
    myMovies[1] = new Movie("A single Man", "Drama", rd2, 100);
    myMovies[2] = new Movie("Hacksaw Ridge", "Action and Adventure", rd3, 139);
    myMovies[3] = new Movie("John Wick", "thrillar", rd4, 110);
    myMovies[4] = new Movie("Moonlight", "Drama", rd5, 101);

    int len = 0;
    for (int i = 0; i < myMovies.length; i++) {
      myMovies[i].moviePrintDetails();
      len += myMovies[i].getlengthOfMovie();
    }

    System.out.println("\nCumulative Time to watch all movies ===> " + len);

    String old = getOldMovies(myMovies);

    String newest = getNewMovies(myMovies);
    System.out.println("\nOld movie: " + old + "\nNew movie " + newest);

    int genreCount = CountGenre(myMovies);
    System.out.println("\nDrama genre repeats ===> " + genreCount + "times");
  }
  // Used this as example: https://goo.gl/r5K2EQ
  // All my methods starts here
  //Getting title of old and new movies

  public static String getOldMovies(Movie[] movies) {
    Date latest = movies.clone()[0].getReleaseDate();
    String title = "";
    for (int i = 1; i < movies.length; i++) {
      Date date2 = movies[i].getReleaseDate();
      if (latest.after(date2)) {
        latest = date2;
        title = movies[i].getTitle();
      }
    }
    return title;
  }

  public static String getNewMovies(Movie[] movies) {
    Date old = movies.clone()[0].getReleaseDate();
    String title = "";
    for (int i = 1; i < movies.length; i++) {
      Date date2 = movies[i].getReleaseDate();
      if (old.before(date2)) {
        old = date2;
        title = movies[i].getTitle();
      }
    }
    return title;
  }

  //Getting the genre count
  public static int CountGenre(Movie[] array) {
    int count = 0;
    String genre = "Drama";
    for (int i = 0; i < array.length; i++) {
      if (array[i].getGenere() == genre) {
        count += 1;

      }
    }
    return count;
  }

}
