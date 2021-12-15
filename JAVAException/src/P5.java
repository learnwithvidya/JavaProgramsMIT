/*
 * Multiple catch statements
 */
public class P5 {

	public static void main(String[] args) {
		int a[] = {5, 10, 0};			//size 3.. i = 0 1 2
		int b = 5;
		try {
			int y = a[1] / a[2];			//divide by zero
			int x = a[3]/b - a[1];			//array a[3] is not found
		}
		catch(ArithmeticException e) {
			System.out.println("Logical Error: Division by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Logical Error: Array index error");
		}
		catch(ArrayStoreException e) {
			System.out.println("Logical Error: Wrong data type");
		}
		catch( Exception e) {
			System.out.println("Logical error.");
		}
		int z = a[1]/a[0];
		System.out.println("z = " + z);
	}

}
