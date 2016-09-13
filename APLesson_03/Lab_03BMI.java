import java.util.Scanner; //import statement

public class Lab_03BMI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println ("Please input your Height in inches:");
		int h = keyboard.nextInt();
		
		System.out.println ("Please input your Weight in pounds:");
		int w = keyboard.nextInt();
		
		System.out.println ("Your BMI is " + w*w/h*h);
	}
}