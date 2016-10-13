import java.util.Scanner;
public class Lab_05Discount
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Please enter item 1");
		String word1 = keyboard.nextLine();
		System.out.println ("Please enter the price");
		double number1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println ("Please enter item 2");
		String word2 = keyboard.nextLine();
		System.out.println ("Please enter the price");
		double number2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println ("Please enter item 3");
		String word3 = keyboard.nextLine();
		System.out.println ("Please enter the price");
		double number3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println ("Please enter item 4");
		String word4 = keyboard.nextLine();
		System.out.println ("Please enter the price");
		double number4 = keyboard.nextDouble();
		keyboard.nextLine();
		
		double subtotal = number1 + number2 + number3 + number4;
		double discount = discount(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal-discount + tax;
		
		System.out.println ("<<<<<<<<<< Receipt >>>>>>>>>>");
		format(word1, number1);
		format(word2, number2);
		format(word3, number3);
		format(word4, number4);
		
		format("Subtotal: ", subtotal);
		format("Tax: ", tax);
		format("Total: ", total);
	}
	public static double discount(double subtotal)
	{
		if (subtotal >= 2000)
		{
			return subtotal * 0.15;
		}
		return 0.0;
	}
	
	
	public static void format(String word, double number)
	{
		System.out.printf("* %20s   . . . . . . . . . . %10.2f\n", word, number);
	}
		
}