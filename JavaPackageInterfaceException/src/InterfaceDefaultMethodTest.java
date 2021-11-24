interface MyIF {
    // This is a "normal" interface method declaration.
    int getNumber();
    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {		//method is static 
        return "Default String";
    }
}

class MyIFImp implements MyIF {
    // Only getNumber() defined by MyIF needs to be implemented.
    // getString() can be allowed to default.
    public int getNumber() {			//method should be defined
        return 100;
    }
}

public class InterfaceDefaultMethodTest {
    public static void main(String[] args) {
        MyIFImp m = new MyIFImp();
        System.out.println(m.getNumber());
        System.out.println(m.getString());
    }
}
