//Method overriding

class A1{
	int i, j;
	A1(int a, int b){
		i = a;
		j = b;
	}
	//display i and j
	void show() {
		System.out.println("i and j : "+ i + " and "+ j);
	}
}

class B1 extends A1{
	int k;
	B1(int a, int b, int c){
		super(a,b);	//class A1 a,b values
		k = c;
	}
	//display k -  this overrides show() in A
	void show() {
		super.show();  //this calls A1's show()
		System.out.println("k :"+ k);
	}
}

class Override {

	public static void main(String[] args) {
		B1 subObj =  new B1(1,2,3);
		subObj.show();

	}

}
