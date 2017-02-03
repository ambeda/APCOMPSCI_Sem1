public class Bill extends Money
{
	private String face;
	
	public Bill()
	{
		super();
		this.face = "";
	}
	
	public Bill(String n, String f, double v)
	{
		super();
		this.face = f;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n"
		super.toString();
	}
}