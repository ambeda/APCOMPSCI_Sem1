import java.util.Scanner;
public class Lab_06CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Number?");
		int number = kb.nextInt();
		System.out.println("Numbers Total?");
		int total = kb.nextInt();
		
		for(int i = number; i <= total;i+=number)
		{
			System.out.println(i + "");
		}
	}
}