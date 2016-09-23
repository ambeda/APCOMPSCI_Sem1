import java.util.Scanner;

public class Lab_04IDCARD
{
	public static void main(String[]args)
	{
		Lab_04IDCARD form = new Lab_04IDCARD();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("First name:");
		String word1 = keyboard.nextLine();
		System.out.println ("Last name:");
		String woord1 = keyboard.nextLine();
		
		System.out.println ("School:");
		String word2 = keyboard.nextLine();
		System.out.println ("School year:");
		String woord2 = keyboard.nextLine();
	
		System.out.println ("Title:");
		String word3 = keyboard.nextLine();
		System.out.println ("Subject:");
		String woord3 = keyboard.nextLine();
		
		System.out.println ("********************************************");
		form.format(word2, woord2);
		form.format(word1, woord1);
		form.format(word3, woord3);
		System.out.println ("********************************************");
	}
	
	public void format(String word, String woord)
	{
		System.out.printf("*%20s  %20s*\n", word, woord);
	}
}