public abstract class GameSystem
{
	private String Platform;
	private int SerialNo;
	
	public GameSystem()
	{
		Platform = "";
		SerialNo = (int) (Math.random() * 8999999) + 1000000;
	}
	
	public GameSystem(String p)
	{
		Platform = p;
		SerialNo = (int) (Math.random() * 8999999) + 1000000;
	}
	
	public String getPlatform()
	{
		return Platform;
	}
	
	public int getSN()
	{
		return SerialNo; 
	}

	
}
