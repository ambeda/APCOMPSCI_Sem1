import java.util.Scanner;
public class Lab_07DigitAve
{
	static int number;
	static int digits;
	static int average;
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Number:");
		number = kb.nextInt();
		num = number;
		avDigits();
		System.out.println ("The average of the digits in " + number + " is " + average);
		
	}
	public static int avDigits()
	{
		
		while(num > 0)
		{
			digits += 1;
			average += 1;
			num /= 10;
			
		}
		return (average/digits);
	}
}