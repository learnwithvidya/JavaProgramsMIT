// A nested interface example.
// This class contains a member interface.
class A {
    // non-nested interfaces can be default or public
    // nested interfaces can be private/protected/public/default
	// this is a nested interface
    interface NestedIF {
        boolean isNonNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNonNegative(int x) {
        return x >= 0;
    }
}
public class InterfaceNestedTest {
    public static void main(String[] args) {
    	// use a nested interface reference
        A.NestedIF nif = new B();			//within class A, so object can be created for A
        System.out.println(nif.isNonNegative(100));
        System.out.println(nif.isNonNegative(-10));
    }
}
