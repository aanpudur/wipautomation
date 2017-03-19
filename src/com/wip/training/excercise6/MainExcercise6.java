package com.wip.training.excercise6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

		Set<Movie> myMovies = new HashSet<>();
		
		myMovies.add(new Movie("Moonlight", "Drama", releaseDate1, 110));
		myMovies.add(new Movie("A single Man", "Drama", releaseDate2, 100));
		myMovies.add(new Movie("Hacksaw Ridge", "Action and Adventure", releaseDate3, 139));
		myMovies.add(new Movie("John Wick", "thrillar", releaseDate4, 110));
		myMovies.add(new Movie("Runaway Bride", "Drama", releaseDate5, 101));
		myMovies.add(new Movie("Runaway Bride", "Drama", releaseDate5, 101));

		System.out.println("Movies in the object array : ");
		for (Movie movie : myMovies) {
			movie.printMovieDetails();
		}
		
		
		int duration = getDuration(myMovies);
		System.out.println("\n\nCumulative Length of all the  movies are : " + duration);

		 getLatestMovies(myMovies);
		
		
	}

	// 3. Calcuate how long it takes to watch all movies ?
	public static int getDuration(Set<Movie> myMovies) {
		int len = 0;
		Iterator<Movie> iterator = myMovies.iterator();
		 
		while (iterator.hasNext()) {
		    Movie movie = iterator.next();
		   len+= movie.getlengthOfMovie();
		   
		}  
	    System.out.println("Total length of all movies = "+ len);
		return len;
	}
	
	public static void getLatestMovies(Set<Movie> movies) {
		Date latest=null, date=null;
		Movie latestMovie =null;
		int i= 0;
		Iterator<Movie> iterator = movies.iterator();
		while (iterator.hasNext()) {
		    Movie movie = iterator.next();
		    if (i==0) {
		    	latest = movie.getReleaseDate();
		        latestMovie= movie;
		    } else {
		    	 date = movie.getReleaseDate();
		    
		    	 if (date.after(latest)) {
		    		 latest=date;
		    		 latestMovie= movie;		    	
		    	 }
		    }
		    
		    i++;
		}  
		
		latestMovie.printMovieDetails();	
	}		
}
	

