import java.util.Scanner;
public class Lab_04p4 //"Average"
{
	public static void main(String[]args)
	{
		Lab_04p4 perimeter = new Lab_04p4();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Number 1?");
		int num1 = keyboard.nextInt();
		System.out.println ("Number 2?");
		int num2 = keyboard.nextInt();
		System.out.println ("Number 3?");
		int num3 = keyboard.nextInt();
		
		print(num1, num2, num3, average(num1, num2, num3));
		
	}
	
	public static double average(int num1, int num2, int num3)
	{
		return (num1 + num2 + num3)/3;
	}
	
	public static void print(int num1, int num2, int num3, double average)
	{
		System.out.printf ("the average of " + num1 +" " + num2 + " " + num3 + "" + " is %10.5f\n", average);
	}
}