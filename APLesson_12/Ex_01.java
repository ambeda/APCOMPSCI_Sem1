import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph
	
	public double distances()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public double distances (int distance, int hours, int minutes, double mph)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues()
	{
		distane = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public int getMPH()
	{
		mph = Math.round(distance/(hours+minutes/60.0));
		return  mph
	}
	
	public static void main (String[]args)
	{
		distances object = new distances ()
	}
}