interface MyInterface {
    void print(String msg);
}

class MyClass1 implements MyInterface {
    public void print(String msg) {
        System.out.println(msg + ":" + msg.length() +" from MyClass1");
    }
}

class MyClass2 implements MyInterface {
    public void print(String msg) {
        System.out.println(msg.length() + ":" + msg +" from MyClass2");
    }
}
public class InterfaceApplyTest {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        MyInterface mi; // create an interface reference variable
        mi = mc1;
        mi.print("Hello World");		//calls print() of MyClass1
        mi = mc2;
        mi.print("Hello World");		//calls print() of MyClass2
    }
}
