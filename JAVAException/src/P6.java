/*
 * Nested try statements
 */
class P6{
   public static void main(String args[]){
      //main try-block
      try{
    	  String string_array[] = {"hello", "world", "today","is","a",
    			  					"good","day."};
    	  System.out.println("String = "+string_array[10]);	//Error
    	  
    	//try-block2
        try{     
        	int a = 10;
        	int b = 0;
        	int x = a/b;
        	System.out.println("x = "+x);
        	//try-block3
            try{
            	int arr[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
            	System.out.println(arr[10]);		//trying to access 10th array elements
            }catch(ArrayIndexOutOfBoundsException e){		//catch block-3
            	System.out.print("ArrayIndex Out Of Bounds Exception");
            	System.out.println(" handled in try-block3");
            }
        }
        catch(ArithmeticException e){
           System.out.print("Arithmetic Exception");
           System.out.println(" handled in try-block2");
        }
    }
      //multiple catch blocks for parent try block
    catch(ArithmeticException e3){
    	System.out.print("Arithmetic Exception");
     	System.out.println(" handled in main try-block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.print("ArrayIndexOutOfBoundsException");
     	System.out.println(" handled in main try-block");
    }
    catch(Exception e5){
    	System.out.print("Exception");
     	System.out.println(" handled in main try-block");
     }
  }
}