import java.util.Scanner;
public class Lab_07Lesson
{
	static int number;
	static int digits = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Number:");
		number = kb.nextInt();
		countDigits();
		System.out.println (number + " has " + digits + " digits in it");
		
	}
	public static void countDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			num /= 10;
		}
	}
----------------------------------------------------------------------------------------------------------------------------
		static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Sentence:");
		sentence = kb.nextLine();
		
			while(sentence.indexOf(" ") >= 0)
			{
				sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ") +1);
			}
		System.out.println ("Without spaces... " + sentence);
	
	}

}