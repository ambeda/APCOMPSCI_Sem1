public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 6;
		int num2 = 14;
		
		System.out.println (num1 * num2);
		
		System.out.println ("-----");
		
		int l = 1;
		int w = 2;
		int h = 3;
		int recprismArea = 2*(w*l+h*l+h*w);
		
		System.out.println ("The area of your rectangular prism is " + recprismArea);
		
		System.out.println ("-----");
		
		String name = "Donald Trump";
		String address = "725 5th Avenue";
		String city = "New York City";
		String state = "NY";
		String zip = "10022";
		
		System.out.println (name + "\n" + address + "\n" + city + ", " + state + " " + zip);
	}
	
}