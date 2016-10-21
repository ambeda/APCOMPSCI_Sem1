import java.util.Scanner;
public class Lab_05GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Subject 1 Grade:");
		String g1 = kb.next(); 
		System.out.println("Subject 2 Grade:");
		String g2 = kb.next();
		System.out.println("Subject 3 Grade:");
		String g3 = kb.next(); 
		System.out.println("Subject 4 Grade:");
		String g4 = kb.next(); 
		System.out.println("Subject 5 Grade:");
		String g5 = kb.next(); 
		System.out.println("Subject 6 Grade:");
		String g6 = kb.next(); 
		System.out.println("Subject 7 Grade:");
		String g7 = kb.next(); 
		
		double gpa = (calcPoints(g1) + calcPoints(g2) + calcPoints(g3) + calcPoints(g4) + calcPoints(g5) + calcPoints(g6) + calcPoints(g7))/7;
		System.out.println ("Your GPa is " + gpa);
	}
	
	public static double calcPoints(String gpa)
	{
		if (gpa.equals("A"))
			return 4.0;
		if (gpa.equals("B"))
			return 3.0;
		if (gpa.equals("C"))
			return 2.0;
		if (gpa.equals("D"))
			return 1.0;
		if (gpa.equals("F"))
			return 0.0; 	
		
		return 0.0;
	}

}