public class Lab_09GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		fillArray(numbers);
		printArray(numbers); 
		getOdds(numbers);
		
	}
	
	public static void fillArray(int[] numbers)
	{
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1; 
		}
		
	}
	
	public static void printArray(int[] numbers)
	{
		System.out.println("Out of the following numbers...");
		
		for(int num: numbers)
			System.out.print(num + " ");
	}
	
	public static void getOdds(int[] numbers)
	{
		System.out.println(" ");
		for(int num: numbers)
		{
			if(num % 2 == 1)
				System.out.print(num + ", ");
		}
		
		System.out.print("are odd numbers");
	}
}