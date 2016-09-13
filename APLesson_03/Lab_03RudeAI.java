import java.util.Scanner; //import statement

public class Lab_03RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println ("Hi, I'm RudeAI, and I have a few questions for you. \nWhat is your name?");
		
		String name = keyboard.nextLine();
		
		System.out.println (name + "? ...Kind of underwhelming- I was expecting something more grandeous.");
		
		System.out.println ("Never mind, then. Well, \"" + name + "\", how old are you?");
		
		int age = keyboard.nextInt();
		
		System.out.println (age + "?! Boy, time's really passing by for you, huh?");
		
		System.out.println ("So, what do " + age + " year old's like you do for fun?");
		keyboard.nextLine();
		String fun = keyboard.nextLine();
		
		System.out.println (fun + "?? THAT's what you like to do for fun?? Things must be getting rough these days for someone to want to do that during their free time...");
		
		System.out.println ("What kind of music do you like, " + name +"?");
		
		String music = keyboard.nextLine();
		
		System.out.println (music + ", huh? Well, that's a little... Uh, you do you, I guess.");
		
		System.out.println ("How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println (siblings + "? Someone's lucky, I guess...");
		
		System.out.println ("So, " + name + ", you're " + age + " already. Do you know what you want to be when you grow up?");
		keyboard.nextLine();
		String idea = keyboard.nextLine();
		
		System.out.println (idea + "... Pretty boring, but I guess it suits you. \nThanks for answering all those questions! Now I have a much better idea of what kinds of people I'll be up against when I take over the world.");
	}
}