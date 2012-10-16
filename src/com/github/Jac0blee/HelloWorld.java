package com.github.Jac0blee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class HelloWorld {

	public static void main (String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String readline;
			System.out.println("Type in the password.");
		while ((readline = in.readLine()) != null) {
				
			String password = "Fireworks";
				
			System.out.println(readline);
			
			if(readline.equals(password)) {
				
				System.out.println("Correct password.");
				
			}
			else {
				
				System.out.println("Incorrect password");
				
			}
					
		}
	
	}

}