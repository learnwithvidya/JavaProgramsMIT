//Demonstrate when constructors are called
//Create a super class
class A3{
	A3(){
		System.out.println("Inside A3's constructor");
	}
}

class B3 extends A3{
	B3(){
		System.out.println("Inside B3's constructor");
	}
}

class C3 extends B3{
	C3(){
		System.out.println("Inside C3's constructor");
	}
}


public class CallingCons {

	public static void main(String[] args) {
		C3 c = new C3();
	}

}
