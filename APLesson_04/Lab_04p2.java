import java.util.Scanner;

public class Lab_04p2
{
	public static void main(String[]args)
	{
		Lab_04p2 volume = new Lab_04p2();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Height:");
		double height = keyboard.nextDouble();
		System.out.println ("Length:");
		double length = keyboard.nextDouble();
		System.out.println ("Width:");
		double width = keyboard.nextDouble();
		
		System.out.println ("The volume is " + volume.calcVol(height, length, width));
	}
	public double calcVol(double height, double length, double width)
	{
		return (height * length * width) * 0.00057870;
	}
	
}