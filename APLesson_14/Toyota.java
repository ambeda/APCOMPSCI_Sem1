public abstract class Toyota implements Location
{
	double[] Location;
	
	public Toyota(String n)
	{
		Location = new double[2];
		String[]locs = n.split(", ");
		Location[0]= Double.parseDouble(locs[0]); 
		Location[1]= Double.parseDouble(locs[1]); 
	}

}