package com.bridgelabz.iofile;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utilityC2.Utility;

public class IOPoem {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		char userinput;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please select menu");
		System.out.println("a. Chicks ­ chick\n"
				+ "b. Duck ­ quack\n"
				+ "c. Turkey ­ gobble\n"
				+ "d. Pig ­ oink, oink\n"
				+ "e. Cow ­ moo, moo\n"
				+ "f. Cat ­meow, meow\n"
				+ "g. Mule ­ Heehaw\n" 
				+ "h. Dog ­ bow wow\n" 
				+ "i. Turtle ­ nerp, nerp\n"
				);
		userinput=scanner.next().charAt(0);
		switch (userinput) {
		case 'a':
			Utility.poem("Chicks", "chick");
			break;
		case 'b':
			Utility.poem("Duck", "quack");
			break;
		case 'c':
			Utility.poem("Turkey", "gobble");
			break;
		case 'd':
			Utility.poem("Pig", "oink");
			break;
		case 'e':
			Utility.poem("Cow", "moo");
			break;
		case 'f':
			Utility.poem("Cat", "meow");
			break;
		case 'g':
			Utility.poem("Mule", "Heehaw");
			break;
		case 'h':
			Utility.poem("Dog", "bow");
			break;
		case 'i':
			Utility.poem("Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}
		scanner.close();

		
	}

}
