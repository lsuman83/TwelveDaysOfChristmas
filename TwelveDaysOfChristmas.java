/* Sean Bordelon
 * COP 3330 0R02 Assignment #3
 * 2/2/2018
 * TwelveDaysOfChristmas.java Program to output the Twelve Days of Christmas song using switch statements
 */

public class TwelveDaysOfChristmas // Beginning of class TwelveDaysOfChristmas
{

	public static void main(String[] args)  // "main" body of the function where program is executed
	{
		System.out.println("Merry Christmas! Time to sing an old time favorite!\n"); // Output to screen
		System.out.println("If you know it sing along!\n"); // Output to screen

		int a; // setting variable a to int value
		String days; // setting variable days to String value
		String presents = "a partridge in a pear tree!"; // setting variable presents to String value and initializing variable
		
		String presents12 = "twelve drummers drumming!"; // setting variable presents12 to String value and initializing variable
		String presents11 = "eleven pipers piping!"; // setting variable presents11 to String value and initializing variable
		String presents10 = "ten lords a leaping!"; // setting variable presents10 to String value and initializing variable
		String presents9 = "nine ladies dancing!"; // setting variable presents9 to String value and initializing variable
		String presents8 = "eight maids a milking!"; // setting variable presents8 to String value and initializing variable
		String presents7 = "seven swans a swimming!"; // setting variable presents7 to String value and initializing variable
		String presents6 = "six geese a laying!"; // setting variable presents6 to String value and initializing variable
		String presents5 = "FIVE GOLDEN RINGS!"; // setting variable presents5 to String value and initializing variable
		String presents4 = "four calling birds!"; // setting variable presents4 to String value and initializing variable
		String presents3 = "three french hens!"; // setting variable presents3 to String value and initializing variable
		String presents2 = "two turtle doves!"; // setting variable presents2 to String value and initializing variable
		
		for (a = 1; a <= 12; a++) // for loop used to run through 12 values, incrementing by 1 after every evaluation of expressions within loop
		{
			switch (a) // switch statement that evaluates 12 different cases based on the value of a
			{
				case 12 -> // case 12 evaluation when a == 12
						days = "twelfth"; // assigning variable days to value
				case 11 -> // case 11 evaluation when a == 11
						days = "eleventh"; // assigning variable days to value
				case 10 -> // case 10 evaluation when a == 10
						days = "tenth"; // assigning variable days to value
				case 9 ->// case 9 evaluation when a == 9
						days = "ninth"; // assigning variable days to value
				case 8 -> // case 8 evaluation when a == 8
						days = "eighth"; // assigning variable days to value
				case 7 -> // case 7 evaluation when a == 7
						days = "seventh"; // assigning variable days to value
				case 6 -> // case 6 evaluation when a == 6
						days = "sixth"; // assigning variable days to value
				case 5 -> // case 5 evaluation when a == 5
						days = "fifth"; // assigning variable days to value
				case 4 -> // case 4 evaluation when a == 4
						days = "fourth"; // assigning variable days to value
				case 3 -> // case 3 evaluation when a == 3
						days = "third"; // assigning variable days to value
				case 2 -> // case 2 evaluation when a == 2
						// break statement exits switch after value is evaluated
						days = "second"; // assigning variable days to value
				default -> // default value of the initial switch statement
						days = "first"; // assigning variable days to value
			} // end of first switch statement

			System.out.printf("On the %s", days); // Output value of days for case of whatever value of a is in the iteration

			switch (a) // beginning of second switch statement for case of gifts given
			{
				case 12 -> // case 12 evaluation when a == 12
						presents = presents12 + "\n" + presents; // adding the value of presents12 to the last value of presents to concatenate the strings
				case 11 -> // case 11 evaluation when a == 11
						presents = presents11 + "\n" + presents; // adding the value of presents11 to the last value of presents to concatenate the strings
				case 10 -> // case 10 evaluation when a == 10
						presents = presents10 + "\n" + presents; // adding the value of presents10 to the last value of presents to concatenate the strings
				case 9 -> // case 9 evaluation when a == 9
						presents = presents9 + "\n" + presents; // adding the value of presents9 to the last value of presents to concatenate the strings
				case 8 -> // case 8 evaluation when a == 8
						presents = presents8 + "\n" + presents; // adding the value of presents8 to the last value of presents to concatenate the strings
				case 7 -> // case 7 evaluation when a == 7
						presents = presents7 + "\n" + presents; // adding the value of presents7 to the last value of presents to concatenate the strings
				case 6 -> // case 6 evaluation when a == 6
						presents = presents6 + "\n" + presents; // adding the value of presents6 to the last value of presents to concatenate the strings
				case 5 -> // case 5 evaluation when a == 5
						presents = presents5 + "\n" + presents; // adding the value of presents5 to the last value of presents to concatenate the strings
				case 4 -> // case 4 evaluation when a == 4
						presents = presents4 + "\n" + presents; // adding the value of presents4 to the last value of presents to concatenate the strings
				case 3 -> // case 3 evaluation when a == 3
						presents = presents3 + "\n" + presents; // adding the value of presents3 to the last value of presents to concatenate the strings
				case 2 -> // case 2 evaluation when a == 2
						presents = presents2 + "\n" + presents; // adding the value of presents2 to the last value of presents to concatenate the strings
				default -> // default case of second switch statement
						presents = "a partridge in a pear tree!"; // initializing the variable presents to a value
			} // end of second switch statement

			System.out.printf(" day of christmas my true love gave me to me %s%n", presents); // Output of second case value dependent upon the iteration value of a
				System.out.println(); // Output blank line for spacing
		} // end of for loop with counter a
	} // end of "main" body function
} // end of Triangle class
