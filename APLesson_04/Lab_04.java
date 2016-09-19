import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		Lab_04 form = new Lab_04();
		Scanner keyboard = new Scanner(System.in);
		System.out.println ("Please enter item 1");
		
		String word1 = keyboard.nextLine();
		
		System.out.println ("Please enter the price");
		
		double number1 = keyboard.nextDouble();
		
		
		form.format(word1, number1);
		
		
	}
	
		public void format(String word, double number)
		{
			System.out.printf("********************************" + "\n%20s  %10.2f", "* ", word, " . . . . . ", number);
		}
		
}