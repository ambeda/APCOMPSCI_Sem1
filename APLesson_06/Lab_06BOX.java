import java.util.Scanner;
public class Lab_06BOX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the word?");
		String word = kb.next();
		
		for(int i = 1; i <= word.length(); i++)
		{
			System.out.println(word);
		}
	}
}