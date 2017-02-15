public class ToyStoreRunner 
{
	public static void main(String[]args)
	{
		String ts = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		
		ToyStore object = new ToyStore(ts);
		
		System.out.println("List...\n" + ts + "\n\n" + object.toString());
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + object.getMostFrequentType());
	}
}