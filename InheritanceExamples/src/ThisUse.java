class A2{
	String str = "hi";
	//default constructor A2()
	
}

class B2 extends A2{
	String str ; //this i hides i in A2
	B2(){
		str = "hello";
	}
	
	void showI()
	{
		String str = "World" ;   //this i hides the i in B2
		//print three variables
		System.out.println("i in superclass = " + super.str);
		System.out.println("i in subclass = " + this.str);
		System.out.println("i in method = " + str);
	}
}


public class ThisUse {

	public static void main(String[] args) {
		B2 thisOb = new B2();
		thisOb.showI();
				
	}

}
