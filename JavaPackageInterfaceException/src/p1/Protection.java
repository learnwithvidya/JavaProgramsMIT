package p1;

public class Protection {
    int n = 1;		//n is defined as default projection means within pkg it can be accessed
    private int nPrivate = 2;  
    protected int nProtected = 3;
    public int nPublic = 4;

    public Protection() {
        System.out.println("---Protection---");
        System.out.println(n);
        System.out.println(nPrivate);
        System.out.println(nProtected);
        System.out.println(nPublic);
    }
}
