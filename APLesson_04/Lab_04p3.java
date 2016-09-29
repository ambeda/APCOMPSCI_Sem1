import java.util.Scanner;
public class Lab_04p3 //"Rectangle"
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Lab_04p3 perimeter = new Lab_04p3();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Length?");
		double l = keyboard.nextDouble();
		System.out.println ("Width?");
		double w = keyboard.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2 * (l + w);
	}
	
	public static void print()
	{
		System.out.println ("Your rectangle is " + perimeter + " ft around.");
	}
}