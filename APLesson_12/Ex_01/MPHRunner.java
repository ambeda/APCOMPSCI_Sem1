import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println ("Please enter the distance.");
		int d = kb.nextInt();
		System.out.println ("Please enter the hours.");
		int h = kb.nextInt();
		System.out.println ("Please enter the minutes.");
		int m = kb.nextInt();
		
		Ex_01 object = new Ex_01(d,h,m); 
		
		System.out.println (d + " miles in " + h + " hours and " + m + " minutes is " + object.getMPH() + " miles per hour.");
		
	}
	

}