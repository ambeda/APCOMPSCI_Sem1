import java.util.Scanner;
public class Lab_08TreeDeg60
{	
	static int i;
	
	public static void main (String[]arga)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please input a word");
		String word = kb.next();
		
		tree(word);
	}
	
	public static String tree(String word)
	{
		if(i < word.length())
		{
			i++;
			System.out.printf("%10s\n", word.substring(0, i));
			tree(word);
		}
		return " ";
	}
}