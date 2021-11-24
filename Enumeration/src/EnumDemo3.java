// Use an enum constructor, instance variable, and method.
enum Apple1 {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price; 			// price of each apple
	// Constructor
	Apple1(int p) { 			//enum constructor
		price = p; 
	}
	
	int getPrice() { 			//method
		return price; 
	} 	
}

class EnumDemo3 {
	public static void main(String args[])
	{
		Apple1 ap;
		//Display price of Winesap.
		//System.out.println("Winesap costs " + Apple1.Winesap.getPrice() + " cents.\n");
		
		//Display all apples and prices.
		System.out.println("All apple prices:");
		for(Apple1 a : Apple1.values())
		System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}