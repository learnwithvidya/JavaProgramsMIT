/*
 * Instead having error, due to Exception handling, 
 * the program continues to execute.
 */
public class P3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 5;
		try {
			int x = a/b;		// 10/0
//			int z[] = {1,2,3,4,5};
//			System.out.println("array 5th element"+z[5]);
		}
		catch(ArithmeticException e){
			System.out.println("Error in logic: Division by Zero is not possible.");
		}
//		catch(Exception e) {
//			System.out.println("Invalid logic!");
//		}
		
		int y = a/c;
		System.out.println("y = "+ y);
	}

}
