import java.util.Scanner;
public class Lab_07DigitAdd
{
	static int number;
	static int sum;
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Number:");
		number = kb.nextInt();
		num = number; 
		sumDigits();
		System.out.println ("The sum of the digits in " + number + " is " + sum);
		
	}
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum = sum + num % 10;
			num /= 10;
		}
	}
}