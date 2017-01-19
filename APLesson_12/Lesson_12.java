public class Usernames 
{
	//Instance variables
	private String userName, firstName, lastName;
	
	//default constructor
	public String UserNames()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//constructor w params
	public String UserNames(String uName, String fName, String lName)	
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getUserName()
	{
		return firstName;
	}
	
	public String getUserName()
	{
		return lastName;
	}
	
	public static void main (String[]args)
	{
		UserNames object = new UserNames("profHndsm", "Professor", "Handsome");
		System.out.println("<<<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name:" + object.getFirstName()+ " " + object.getLastName());
		System.out.println("User Name:" + object.getUserName());
		
	}
	
}