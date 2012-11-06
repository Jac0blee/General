package com.github.Jac0blee;

import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
//exercise 5/6 for chapter 2
/*class Dog{
	
	String name;
	String says;
	
}*/


public class Thinking_in_Java {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String readline;
		
		System.out.println("Rather a lot to type");
		
		Random rand = new Random();
		
		/*Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = d2;
		d1.name = "spot";
		d2.name = "scruffy";
		d1.says = "Ruff!";
		d2.says = "Wurf!";
		boolean x, y;
		x = d1.name == d3.name;
		y = d1.says == d3.says;
		System.out.println(x + "" + y);
		x = d1.name.equals(d3.name);
		y = d1.says.equals(d3.says);
		System.out.println(x + "" + y);
		
		
		System.out.println(d1.name + " says: " + d1.says);
		System.out.println("");
		System.out.println(d2.name + " says: " + d2.says);
		*/
		
		
		/*int j, k;
		float i;
		
		j = rand.nextInt(100) + 1;
		i = rand.nextFloat();
		
		i = i * (-j);
		
		System.out.println("j : " + j);
		System.out.println("i : " + i);
		
		i--;
		System.out.println("i : " + i);
		i++;
		System.out.println("i : " + i);
		j--;
		System.out.println("j : " + j);
		j++;
		System.out.println("j : " + j);
		*/
		//exercises and chapter 1
	/*	System.out.print("Hello, it's: ");
		System.out.println(new Date());
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
		
		class exercise1 {
			
			int number;
			char char1;
			
		}
		
		exercise1 test = new exercise1();
		
		System.out.println(test.char1);
		System.out.println(test.number);
		//Exercise 2
		class AllTheColorsOfTheRainbow {
			int anIntegerRepresentingColors;
			void changeTheHueOfTheColor(int newHue) {
				
				if(newHue == 1) {
					anIntegerRepresentingColors = 1;
					System.out.println("You changed the color to Blue");
				}
				else if(newHue == 2) {
					anIntegerRepresentingColors = 2;
					System.out.println("You changed the color to Red");
				}
				else if(newHue == 3) {
					anIntegerRepresentingColors = 3;
					System.out.println("You changed the color to Black");
				}
				
			}
		}
		
		AllTheColorsOfTheRainbow Color = new AllTheColorsOfTheRainbow();
	
		Color.anIntegerRepresentingColors = 1;
		
		int num = 1;
		
		
		Color.changeTheHueOfTheColor(num);
		num += 1;
		Color.changeTheHueOfTheColor(num);
		num += 1;
		Color.changeTheHueOfTheColor(num);
		num -= 1;
		Color.changeTheHueOfTheColor(num);
		*/
		//for some reason I'm having a hard time figuring out how to use static classes :( 
		/*class Car {

			int width;
			int height = 5;
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

		System.out.println("Choose the name for your mustang!");
		
		Mustang.name = in.readLine();

		System.out.println(Mustang.name);
		Mustang.ReturnName();
	*/
	}

}
