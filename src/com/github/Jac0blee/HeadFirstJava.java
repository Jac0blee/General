package com.github.Jac0blee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt() {
		System.out.println("The Latest and greatest in " + genre + " Movies: " + title + "    Rated: " + rating + "/10 by Metacritic");
	}
}

public final class HeadFirstJava {

	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "StarWars: A New Hope";
		one.genre = "Sci-Fi";
		one.rating = 9;
		one.playIt();
		
		Movie two = new Movie();
		two.title = "SAHARA";
		two.genre = "Action";
		two.rating = 4;
		two.playIt();
		
		Movie three = new Movie();
		three.title =	"Passion of the Christ";
		three.genre = "Drama";
		three.rating = 4;
		three.playIt();
		
		
		
	/*	System.out.print("i am amazing :)");
		int numCows = 5;
		System.out.println(numCows);
		String me = "Jacob";
		System.out.println(me);
		int i = 0;
		//loops
		while(i < 10)
		{
			me = me + (" This is the " + (i+1) + " time"); 
			i++;
		}
		System.out.println(me);
		int ix = 2;
		
		for (int x = 0; x < 20; x++){
			
			ix += 5;
			ix /= 2;
			if (ix <= 5){
				
				ix += 50;
			}
			else {
				ix -= 5;
			}
			System.out.println(ix);
		}
		
		numCows = numCows * 17;
		System.out.println("number of cows: " + numCows);
		double dang = Math.random();
		dang = dang * 100;
		System.out.println(dang);*/
		// single line commenting it up
		/* Multi line commenting it up */
		
	}

}