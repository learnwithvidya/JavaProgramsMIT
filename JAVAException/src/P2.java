/*
 * When error occurs the programs terminates
 */

public class P2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 5;
		int x = a/b;					//no compiler error
		System.out.println("x = "+ x);
		
		int y = a/c;		//2
		System.out.println("y = "+ y);
	}
}
/*
 * When the program is executed, the exception is raise as:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 				at P2.main(P2.java:7)
 * 
 * and the program terminates
 */

