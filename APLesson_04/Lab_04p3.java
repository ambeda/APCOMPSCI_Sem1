import java.util.Scanner;
public class Lab_04p3 //"Rectangle"
{
	public static void main(String[]args)
	{
		Lab_04p3 perimeter = new Lab_04p3();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Length?");
		double l = keyboard.nextDouble();
		System.out.println ("Width?");
		double w = keyboard.nextDouble();
		
		print(calcPerim(l, w));
		
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf ("Your rectangle is %10.5f\n", perimeter);
	}
}