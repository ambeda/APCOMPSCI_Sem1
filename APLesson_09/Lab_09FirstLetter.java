import java.util.Scanner; 
public class Lab_09FistLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		String[] Words = new String[5];
		
		System.out.println("Enter 5 words:"); 
		for(int i = 0; i < Words.length; i++)
		{
			Words[i] = kb.next(); 
		}
		
		first(Words);
	}
	
	public static void first(String[] Words)
	{
		for(String word : Words)
		{
			System.out.println(word.charAt(0)); 
		}
	}
}