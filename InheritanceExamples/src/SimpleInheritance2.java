class M {
    int i;
    private int j;
	
    void set(int x, int y) {
        i = x;
        j = y;
        System.out.println("x and y = "+i + j);
    }
}

class N extends M {
    int total;
	
    void sum() {
        total = i + j; 			// Error, j is not accessible here
    }
}

public class SimpleInheritance2 {
    public static void main(String[] args) {
    	M objM = new M();
    	objM.set(2, 3);
    	
        N obj = new N();
        obj.set(10, 20);
        obj.sum();
        System.out.println(obj.total);
    }
}
