// Using abstract methods and classes.
abstract class FigureNew {
	double dim1;
	double dim2;
	FigureNew(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	// area is now an abstract method
	abstract double area();
}

class RectangleNew extends FigureNew {
	RectangleNew(double a, double b) {
		super(a, b);
	}
	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}
class TriangleNew extends FigureNew {
	TriangleNew(double a, double b) {
		super(a, b);
	}
	// override area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}
class AbstractAreas {
	public static void main(String args[]) {
		//FigureNew f = new FigureNew(10, 10); // illegal now
		RectangleNew r = new RectangleNew(9, 5);
		TriangleNew t = new TriangleNew(10, 8);
		
		FigureNew figref; // this is OK, no object is created
		figref = r;
		System.out.println("Area is " + figref.area());
		
		figref = t;
		System.out.println("Area is " + figref.area());
	}
}