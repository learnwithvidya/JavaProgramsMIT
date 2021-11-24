class A {
    int i, j;

    void showij() {
        System.out.println("i and j = "+i+" and "+j);
    }
}

class B extends A{
    int k;

    void showk() {
        System.out.println("k = "+k);
    }

    void sum() {
        System.out.println("Sum = "+(i+j+k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();	//object of A class
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
        
        B subOb = new B();		//object of B class
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}
