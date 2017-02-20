package com.wip.training.excercise6;


import java.util.Calendar;
import java.util.Date;

public class MainExcercise6 {

  public static void main(String[] args) {
    // creating calender instance and date
    Calendar cal = Calendar.getInstance();

    // built based on the previous homework
    cal.set(2016, Calendar.OCTOBER, 15);
    Date releaseDate1 = cal.getTime();

    cal.set(2013, Calendar.NOVEMBER, 13);
    Date releaseDate2 = cal.getTime();

    cal.set(2007, Calendar.SEPTEMBER, 13);
    Date releaseDate3 = cal.getTime();

    cal.set(2011, Calendar.NOVEMBER, 15);
    Date releaseDate4 = cal.getTime();

    cal.set(2025, Calendar.JANUARY, 13);
    Date releaseDate5 = cal.getTime();

    // 1. Create an array with couple of movies, say 5.
    Movie[] myMovies = new Movie[5];

    myMovies[0] = new Movie("Moonlight", "Drama", releaseDate1, 110);
    myMovies[1] = new Movie("A single Man", "Drama", releaseDate2, 100);
    myMovies[2] = new Movie("Hacksaw Ridge", "Action and Adventure", releaseDate3, 139);
    myMovies[3] = new Movie("John Wick", "thrillar", releaseDate4, 110);
    myMovies[4] = new Movie("Runaway Bride", "Drama", releaseDate5, 101);

    // 2. Print all movie details using for each loop
    System.out.println("Movies in the object array :: ");
    for (Movie movie : myMovies) {
      movie.printMovieDetails();
    }
    // Find cumulative duration
    int duration = getDuration(myMovies);
    System.out.println("\n\nCumulative Length of all the  movies are :: " + duration);

    // getting oldest and newest movies in the arraylist
    int index = getLatestMovies(myMovies);
    int indexold = getOldMovies(myMovies);
    System.out.print("\nLatest Movie :: ");
    myMovies[index].printMovieDetails();
    System.out.print("\nOld Movie :: ");
    myMovies[indexold].printMovieDetails();

    // Getting the number of times given genre repeated
    String genre = "Drama";
    int count = countGenre(myMovies, genre);
    System.out.println("\n\n" + genre + " Genre repeated :: " + count + " times.");

  }

  // 3. Calcuate how long it takes to watch all movies ?
  public static int getDuration(Movie[] array) {
    int len = 0;
    for (int i = 0; i < array.length; i++) {
      //array[i].printMovieDetails();
      len += array[i].getlengthOfMovie();
    }
    return len;

  }


  // 5. What is latest movie (using release date) --Static method in Main class, pass movie array,
  public static int getLatestMovies(Movie[] movie) {
    Date latest = movie[0].getReleaseDate();
    int index = 0;
    for (int i = 1; i < movie.length; i++) {
      Date date1 = movie[i].getReleaseDate();
      if (date1.after(latest)) {
        latest = date1;
        index = i;
      }
    }
    return index;
  }

  // Oldest movie in the object array list
  public static int getOldMovies(Movie[] movie) {
    Date latest = movie[0].getReleaseDate();
    int index = 0;
    for (int i = 1; i < movie.length; i++) {
      Date date1 = movie[i].getReleaseDate();
      if (date1.before(latest)) {
        latest = date1;
        index = i;
      }
    }
    return index;
  }

  // Getting the genre count
  public static int countGenre(Movie[] array, String genre) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i].getGenere() == genre) {
        count += 1;
      }
    }
    return count;

  }
}


