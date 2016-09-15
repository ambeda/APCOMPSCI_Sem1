import java.util.Scanner; //import statement

public class Lab_03SimpleUserInputCollector
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println ("What is your name?");
		String name = keyboard.nextLine();
		
		System.out.println ("What is your age?");
		String age = keyboard.nextLine();
		
		System.out.println ("What is your gender?");
		String gender = keyboard.nextLine();
		
		System.out.println ("Where do you live?");
		String location = keyboard.nextLine();
		
		System.out.println ("What is one word you'd use to describe yourself?");
		String adj = keyboard.next();
		
		System.out.println ("You are " + name + ", a " + age + " year old " + gender + " living in " + location + ", and you think you are " + adj + ".");
	}
}