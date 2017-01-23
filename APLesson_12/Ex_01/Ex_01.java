import java.lang.Math.*;
public class Ex_01
{
	private int distance, hours, minutes;
	private double mph;
	
	public Ex_01()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public Ex_01(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance/(hours+minutes/60.0));
		return  mph;
	}
	

}