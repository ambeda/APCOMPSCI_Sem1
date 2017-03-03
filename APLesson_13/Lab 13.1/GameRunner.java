public class GameRunner
{
	public static void main(String[]args)
	{
		XBox x = new XBox("XBox");
		PlayStation y = new PlayStation("PlayStation");
		PC z = new PC("PC");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}