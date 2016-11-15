import java.util.Scanner;
public class Lab_08Underscores
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter A Sentence:");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
		
	}
	public static void String replace(String sentence)
	{		
		while(sentence.indexOf(" ") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") +1);
			replace(sentence);
		}
		return sentence;
	}
	
}