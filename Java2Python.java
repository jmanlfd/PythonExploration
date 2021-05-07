package java2python;

import java.util.Scanner;

public class Java2Python {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello. What's your name?");
		String name = input.nextLine();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println("Hi, " + name + ". How old are you?");

		try {
			int age;
			boolean invalid;
			do {
				invalid = false;
				age = Integer.parseInt(input.nextLine());
				if (age <= 0) {
					System.out.println("That's impossible.");
					invalid = true;
				} else if (age < 3 || age > 99) {
					System.out.println("That sounds unlikely.");
				}
			} while (invalid);

			String[] colors = { "white", "black", "gray", "yellow", "red", "blue", "green", "brown", "pink", "orange", "purple", "cyan", "magenta" };
			System.out.println("What's your favorite color?");
			String color = input.nextLine();
			color = color.toLowerCase();
			if (color.matches("^[a-z]{3,}")) {
				for (int i = 0; i < colors.length; ++i) {
					if (color.equals(colors[i])) {
						System.out.println("That's cool. " + colors[i].substring(0, 1).toUpperCase() + colors[i].substring(1) + " is a nice color.");
						input.close();
						return;
					}
				}
				System.out.println("I didn't find your color on my list. That doesn't mean that it's not a color, it just means that I have a short list.");
			} else {
				System.out.println("That's definitely not a color.");
			}
		} catch (NumberFormatException e) {
			System.out.println("You didn't specify a valid integer.");
		} finally {
			input.close();
		}
	}

}
