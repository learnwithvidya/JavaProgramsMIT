// Use the built-in enumeration methods.
//values() and valueOf() demo
enum Apples {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo2 {
	public static void main(String args[])
	{
		Apples ap;
		System.out.println("Here are all Apple constants:");
		// use values()
		Apples allApples[] = Apples.values(); //storing
		for(Apples a : allApples)
			System.out.println(a);
			System.out.println();
		
		// use valueOf()
		ap = Apples.valueOf("Winesap");
		System.out.println("ap contains " + ap);
		System.out.println("Index of Winesap is: "+Apples.valueOf("Winesap").ordinal()); 
	}
}