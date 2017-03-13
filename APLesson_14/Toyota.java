public class Toyota implements Location
{
	double[] Location;
	public Toyota()
	{
		Location = new double[2];
	}
	
	public Toyota(String l)
	{
		Location = new double[2];
		String[] locs = l.split(", ");
		Location[0] = Double.parseDouble(locs[0]);
		Location[1] = Double.parseDouble(locs[1]);
	}
	
	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	
	public void getLoc()
	{
		
	}
}