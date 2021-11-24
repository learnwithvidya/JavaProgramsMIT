interface Callback {
    void call(int param);
}

class Client implements Callback {
    public void call(int p) {
        System.out.println("call method called with " + p);
    }
    public void t() {
        System.out.println("simple method, not related with Callback");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // Error, Callback is abstract, can't be instantiated
        //Callback c = new Callback();
        // Can't instantiate an interface directly
        Client c = new Client();
        c.call(42);
        c.t();
        // Accessing implementations through Interface reference
        Callback cb = new Client();		//cb is reference of interface but an object of client.
        cb.call(84);
        //cb.t(); //Error, no such method in Callback
    }
}
