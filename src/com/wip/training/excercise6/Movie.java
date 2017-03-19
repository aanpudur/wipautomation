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

  Movie(String title, String genre, Date releaseDate, int lengthOfMovie) {
    this.title = title;
    this.genre = genre;
    this.releaseDate = releaseDate;
    this.lengthOfMovie = lengthOfMovie;
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

  public  void printMovieDetails() { 
    System.out.print("\nName: " + getTitle() + ", ");
    System.out.print("Genere:" + getGenere() + ", ");
    System.out.print("Release date: " + getReleaseDate() + ", ");
    System.out.print("Length of movie: " + getlengthOfMovie());

  }
public Movie() {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Movie other = (Movie) obj;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}



}
