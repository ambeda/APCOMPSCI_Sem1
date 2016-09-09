import java.util.Scanner; //import statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println ("How are you today?");
		
		String day = keyboard.nextLine();
		
		System.out.println ("I'm doing " + day + " today, too.");
		
		System.out.println ("On a scale of 1 to 10, how would you rate your day?");
		
		int num = keyboard.nextInt();
		
		System.out.println ("That's wonderful!");
		
		
	}
}