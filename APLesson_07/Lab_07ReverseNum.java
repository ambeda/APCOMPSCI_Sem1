import java.util.Scanner;
public class Lab_07ReverseNum
{
	static int number;
	static int rev;
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please Enter A Number:");
		number = kb.nextInt();
		num = number; 
		getReverse();
		System.out.println (number + " reversed is " + rev);
		
	}
	public static void getReverse()
	{
		int rev2 = rev;
		while(num > 0)
		{
			rev *= 10;
			rev2 = rev += 1;
			num /= 10;
		}
		
	}
}