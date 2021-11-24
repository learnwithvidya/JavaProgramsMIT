/* Here, Box uses a parameterized constructor to
*  initialize the dimensions of a box.
*/

class Box2 
{
		double width;  double height;  double depth;

		Box2(double w, double h, double d) 
		{           
			width = w;
			height = h;
			depth = d;
		}
		double volume() 
		{       return width * height * depth;    }
}

class BoxDemo7 
{      public static void main(String args[]) 
	    {
		    Box2 mybox1 = new Box2(10, 20, 15);
		    Box2 mybox2 = new Box2(3, 6, 9);
		    double vol;
		    vol = mybox1.volume();
		    System.out.println("1. Volume is " + vol);
		    vol = mybox2.volume();
		   System.out.println("2. Volume is " + vol);
	    }
}



