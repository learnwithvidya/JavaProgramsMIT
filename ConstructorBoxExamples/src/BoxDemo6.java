/*
 * Default constructor demo
 */
class Box 
{     
         double width;
         double height;
         double depth;
	     Box()
	       {	     
              System.out.println("Constructing Box");
		      width = 10;
		      height = 20;
		      depth = 30;
	       }
	      double volume()
	      {      
	    	  return width * height * depth;
	      }  
 }

class BoxDemo6
{        public static void main(String args[]) 
	      {
		    Box mybox1 = new Box();
		    Box mybox2 = new Box();
		    
            double vol1, vol2;
		    vol1 = mybox1.volume();
		    System.out.println("1. Volume is " + vol1);
		    vol2 = mybox2.volume();
		    System.out.println("2. Volume is " + vol2);
		    /*
		     * as both mybox1 and mybox2 are taking Box() constructor,
		     * they will display same results
		     */
	    }
}

