import java.util.Scanner;
public class Lab_06Lefttriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the word?");
		String word = kb.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}