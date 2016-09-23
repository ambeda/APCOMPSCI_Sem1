import java.util.Scanner;

public class Lab_04p1
{
	public static void main(String[]args)
	{
		Lab_04p1 loan = new Lab_04p1();
		Scanner keyboard = new Scanner(System.in);
		//user inputs 
		System.out.println ("Rate:");
		double rate = keyboard.nextDouble();
		System.out.println ("Principl:");
		double principl = keyboard.nextDouble();
		System.out.println ("Time:");
		double time = keyboard.nextDouble();
		System.out.println ("Number:");
		double number = keyboard.nextDouble();
		
		System.out.println("Your monthly rate payment is " + loan.payment(rate, principl, number, time));
	}
	
	public double payment(double rate, double principl, double number, double time)
	{
		return (principl*(Math.pow(1+rate/number, number*time)))/(time*12);
	}
	
}