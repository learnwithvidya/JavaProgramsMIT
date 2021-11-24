//using super to overcome name hiding


class A4{
	int i;
}

//create a subclass by extending class A
class B4 extends A4{
	int i; //this hides the i in A
	
	B4(int a, int b){
		super.i = a; //i in A4
		i = b;
	}
	
	void showSuperClassI() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

class UseSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 subClassObj = new B4(1,2);
		subClassObj.showSuperClassI();

	}

}
