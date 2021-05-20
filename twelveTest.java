
public class twelveTest {

	public static void main(String[] args) {
		System.out.println("Merry Christmas! Time to sing an old time favorite!\n");
		System.out.println("If you know it sing along!\n");

		int a, b;
		String days;
		String presents = "a partridge in a pear tree!";
		
		String presents12 = "twelve drummers drumming!";
		String presents11 = "eleven pipers piping!";
		String presents10 = "ten lords a leaping!";
		String presents9 = "nine ladies dancing!";
		String presents8 = "eight maids a milking!";
		String presents7 = "seven swans a swimming!";
		String presents6 = "six geese a laying!";
		String presents5 = "FIVE GOLDEN RINGS!";
		String presents4 = "four calling birds!";
		String presents3 = "three french hens!";
		String presents2 = "two turtle doves!";
		
		for (a = 1; a <= 12; a++)
		{
			switch (a)
			{
				case 12:
				{
					days = "twelfth";
				}
				
				case 11:
				{
					days = "eleventh";

				}
				
				case 10:
				{
					days = "tenth";

				}
				
				case 9:
				{
					days = "ninth";

				}
				
				case 8:
				{
					days = "eighth";

				}
				
				case 7:
				{
					days = "seventh";

				}
				
				case 6:
				{
					days = "sixth";

				}
				
				case 5:
				{
					days = "fifth";

				}
				
				case 4:
				{
					days = "fourth";

				}
				
				case 3:
				{
					days = "third";

				}
				
				case 2:
				{
					days = "second";

				}
				
				default:
				{
					days = "first";

				}
			} // end of first switch statement
			
			System.out.printf("On the %s", days);

			switch (a) {
				case 12 -> presents = presents12 + "\n" + presents;
				case 11 -> presents = presents11 + "\n" + presents;
				case 10 -> presents = presents10 + "\n" + presents;
				case 9 -> presents = presents9 + "\n" + presents;
				case 8 -> presents = presents8 + "\n" + presents;
				case 7 -> presents = presents7 + "\n" + presents;
				case 6 -> presents = presents6 + "\n" + presents;
				case 5 -> presents = presents5 + "\n" + presents;
				case 4 -> presents = presents4 + "\n" + presents;
				case 3 -> presents = presents3 + "\n" + presents;
				case 2 -> presents = presents2 + "\n" + presents;
				default -> presents = "a partridge in a pear tree!";
			}
				System.out.printf(" day of christmas my true love gave me to me %s%n", presents);
				System.out.println();
		}
	}

	}


