import java.util.Scanner; //import statement

public class Lab_05BMI
{
	static String Condition; 
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println ("Please input your Height in inches:");
		double h = keyboard.nextDouble();
		
		System.out.println ("Please input your Weight in pounds:");
		double w = keyboard.nextDouble();
		double BMI = (w / h / h * 703);
		
		System.out.println ("Your BMI is " + BMI);
		calcCondish(BMI);
		System.out.println ("You are " + Condition);
	
	}
	
	public static void calcCondish(double BMI)
	{
		if (BMI < 18.5)
			Condition = ("Underweight");
		else if (BMI <= 24.9)
			Condition = ("Normal");
		else if (BMI <= 29.9)
			Condition = ("Overweight");
		else if (BMI <= 34.9)
			Condition = ("Obese");
		else if (BMI <= 39.9)
			Condition = ("very Obese");
		if (BMI > 39.9)
			Condition = ("Morbidly Obese");
	}
}