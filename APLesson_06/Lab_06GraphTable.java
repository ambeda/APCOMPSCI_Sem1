import java.util.Scanner;
public class Lab_06GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Integer:");
		int number = kb.nextInt();
		System.out.println("Table Size:?");
		int size = kb.nextInt();
		
		form.format (number, i);
		
		for(int i = 1; i <= size;i+=number)
		{
			System.out.printf(i + "");
		}
	}
	
	public void format(int number, int i)
	{
		System.out.printf("%20s | %20s", number, i);
	}
		

}