import java.util.Scanner;
public class Lab_08Center
{	
	public static void main (String[]arga)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("What is your first word?");
		String word1 = kb.next();
		System.out.println ("What is your second word?");
		String word2 = kb.next();
		System.out.println ("What is your third word?");
		String word3 = kb.next();
		
		System.out.println (makeCenter(word1) + "\n" + makeCenter(word2) + "\n" + makeCenter(word3));
	}
	public static String makeCenter(String word)
	{
		if (word.length() > 20)
			return word;
		else
		{
			return makeCenter (" " + word + " ");
		}
	}
}