public class Lab_05Discount
{
	public static void main(String[]args)
	{
			Lab_05Discount form = new Lab_05Discount();
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
		System.out.println ("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		form.format(word1, number1);
		form.format(word2, number2);
		form.format(word3, number3);
		
		double subtotal = (number1 + number2 + number3);
		System.out.printf ("\n\n* %20s   . . . . . . . . . . %10.2f\n", "Subtotal:", subtotal);
		
		double tax = (subtotal * 0.08);
		System.out.printf ("* %20s   . . . . . . . . . . %10.2f\n", "Tax:", tax);
		
		double total = (subtotal + tax);
		System.out.printf ("* %20s   . . . . . . . . . . %10.2f\n", "Total:", total);
		
		System.out.println ("_______________________________________________________________\n* Thank you for your support *");
	}
	
	
	public static void discount(int number1, int number2, int number3, boolean discount)
	{
		
	}
	
	
	public void format(String word, double number)
	{
		System.out.printf("* %20s   . . . . . . . . . . %10.2f\n", word, number);
	}
		
}