import java.util.Scanner; 
public class Lab_05ADVENTURE
{
	static String c1; 
	static String c2; 
	static String c3;
	
	public static void main(String[]args)
	{
		adventure(); 
		
	}
	
	public static void adventure()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your Queen has asked you to slay a beast that has been wreking havoc on the land. \nYou're excited- so excited in fact that you've for gotten what she has asked you to slay! \nWhat was it again...? A lizard or a dragon?"); 
		System.out.println("A- A dragon, of course!, B- A lizard!"); 
		c1 = kb.next(); 
		
		if (c1.equals("A") || c1.equals("a"))
			{
			System.out.println("---\nAh, of course, it was a dragon you were after! A vile, ferocious thing with red scales and claws sharper than axe blades. \nYou're undoubtedly nervous, but with your sword in hand you feel like you can do anything. You set off down the path to \nseek out the beast. \n\nAfter days of walking, you come across a fork in the road. The conveniently placed sign tells you that to the left there \nis a beautiful babbling brook where you may forget your worries and rest. \nTo the right, there is a tall mountain, wherein a cave lies the beast you have been looking for. Which path do you choose?"); 
			System.out.println("A- Left, B- Right"); 
			c2 = kb.next(); 
			if (c2.equals("B") || c2.equals("b"))
			{
				System.out.println("---\nThe trek is long and arduous, but at long last you make it to the cave. peering inside, you come face to face with the very \nbeast itself, asleep on a pile of gold! \nOh, the shine of gold coins does look so enticing. Perhaps you could just grab a few- they would set you for life! You \nwouldn't need to slay the dragon then! You'd be rich enough to run away and live on your own! But- your duty as a soldier \ncalls, too. You're torn between riches and your honour. Which do you choose?");
				System.out.println("A- Your honour! B- Riches beyond your wildest dreams!");
				c3 = kb.next(); 
				if (c3.equals("A") || c3.equals("a"))
				{
					System.out.println("---\nThat's right! Honour is the most important thing in this world, especially for a soldier- and once you bring the head of this \nbeast back to the queen, you'll be paid in riches tenfold! You sneak up to the dragon, turned on its side to reveal its soft and \nvulnerable underbelly. You draw your sword, and with expert precision you plunge it into the beast's stomach! \nIt awakens and howls in pain and turns to blow you away in flames, but the shock and suprise renders it incapable of \ndefending itself. With another jab, the dragon is as good as dead. You cut off its head and take it back with you, presenting \nit to the queen. \nOh, she is most pleased! In return for your valour, she grants you a large block of land and several hundred crowns to call \nyour very own. You're rich! You're revered! Your family will be honoured for generations. \n\n-Good End-");
				}
				else if (c3.equals("B") || c3.equals("b"))
					System.out.println("---\nYou creep toward the massive hoard of gold, careful not to make too much noise or unsettle a stack of coins. You search around \nthe pile for the things that look the most valuable, before your eyes rest upon a beautiful golden crown. \nThe embroidery allures you, every part of the crown calls your name! You reach out and take a hold of its points, not realizing \nthat the crown was resting upon the very nose of the dragon itself! \nIts eyes open with a start, and the slits of its pupils narrow to focus on you. It raises it's great head and exhales a blast of \nburning fire, torching you on the spot. \nThe dragon, intruder terminated, goes right back to sleep. \n\n-Bad End-");
				else
				{
					System.out.println("Choose only option A or B!"); 
					adventure();
				}
			}
			else if (c2.equals("A") || c2.equals("a"))
				System.out.println("---\nThe brook is just ahead, you can see it sparkling in the sun. Once you reach it, you immediately hop in! It's relaxing. \nSo relaxing... You feel yourself becoming drowsy, listening to the wind in the trees and the churning of the water. \nSoon, you are alseep. Moments later, a band of thieves find you. The opportunity of stealing from a soldier is too enticing \nto give up- they grab everything, your sword, your shield, your shoes! You wake up to find that you are in no condition to \nslay a mouse, let alone a dragon. \nYou return to the presence of the queen and she greets you with utter dissapointment. She sends you to the executioner for \nyour incompetence. \n\n-Bad End-");
			else 
			{
				System.out.println("Choose only option A or B!"); 
				adventure(); 
			}
		}
		else if (c1.equals("B") || c1.equals("b"))
		{
			System.out.println("---\nA lizard? Yes, definitely- it was a lizard! You find one sitting on a rock, and with a quick slash of your sword it's head \ncomes clean off. You bring it into the castle to present it to the queen, but something about the look on her face tells you that \na lizard wasn't what you were supposed to be after. \nJust like the lizard you've so valiantly slain, the queen sends you off to be beheaded. \n\n-Bad End-"); 
		}
		else 
		{
			System.out.println("Choose only option A or B!"); 
			adventure(); 
		}
	}
}