package com.github.Jac0blee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thinking_in_Java {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String readline;

		class Car {

			int width;
			int height;
			int length;
			String name = "Suzie";
			
			void ReturnName() {
				System.out.print("The car's name is: ");
				System.out.println(name);
				
				
			}
			
		}

		Car Mustang = new Car();

		Mustang.height = 5;
		Mustang.width = 8;
		Mustang.length = 20;
		

		System.out.println(Mustang.height);
		System.out.println(Mustang.width);
		System.out.println(Mustang.length);
		System.out.println(Mustang.name);
		
		Mustang.name = in.readLine();
		
		System.out.println(Mustang.name);
		Mustang.ReturnName();
		
	}

}
