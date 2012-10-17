package com.github.Jac0blee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class HelloWorld {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

		boolean exit = false;

		String readline;

		System.out.println("Type in the password.");

		while ((readline = in.readLine()) != null && exit != true) {

			String password = "Fireworks";

			System.out.println(readline);

			if (readline.equals(password)) {

				System.out.println("Correct password.");

				System.out.println("What do you want to do?");
				System.out.println("1. See the time");
				System.out.println("2. What is the OS?");
				System.out.println("3. Help");
				System.out.println("4. Exit");

				while (!exit) {

					readline = in.readLine();

					if (readline.equals("1")) {
						cal = Calendar.getInstance();
						System.out.println("");
						System.out.println(sdf.format(cal.getTime()));
					} else if (readline.equals("2")) {
						System.out.println("-JACSystems 500-");
					} else if (readline.equals("3")) {
						System.out.println("What do you want to do?");
						System.out.println("1. See the time");
						System.out.println("2. What is the OS?");
						System.out.println("3. Help");
						System.out.println("4. Exit");
					} else if (readline.equals("4")) {
						System.out.println("Goodbye!");
						exit = true;
					} else {
						System.out.println("invalid choice");
					}
					System.out.println("");
				}
			} else {

				System.out.println("Incorrect password");

			}

		}

	}

}