import java.util.Scanner;
public class Lesson_09
{
	public static void main (String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please enter 5 nmes");
		
		//fills the array
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
			
		}
		
		//print the array
		for(String name : names)
		{
			System.out.print("\"" + name.length() + "\", ");
		}
	}
-----------------------------------------------------------------------------------------------
	public static void main (String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int num : numbers)
			System.out.println(num);
	
		
		System.out.println();
		System.out.println("the sum of the numbers above is... " + sumArray(numbers));
	}
	
	public static int sumArray(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
		}
		return sum;
	}
}