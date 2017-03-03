public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String n)
	{
		super(n);
	}
	
	public String systemInput()
	{
		return "Keyboard & Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSN() + "\nSystem Input: " + systemInput() + "\n";
	}
}