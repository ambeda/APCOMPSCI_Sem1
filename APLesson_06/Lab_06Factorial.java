import java.util.Scanner;
public class Lab_06Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number?");
		int number = kb.nextInt();
		
		for(int i = number; i <= 100;i+=number)
		{
			System.out.println(i + "");
		}
	}
}