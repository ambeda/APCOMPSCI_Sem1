public class GMC
{
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double x, double y)
	{
		x = X;
		y = Y;
	}
	
	public int getID()
	{
		return (int) (Math.random() * 899999) + 100000;
	}
	
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	
	public Array getLoc()
	{
		double [][] Location = new double [x,y];
		return Loc;
	}
}