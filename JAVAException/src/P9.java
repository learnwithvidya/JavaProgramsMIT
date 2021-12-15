public class P9{
	public static void main(String args[]){    
		  try{    
		//below code do not throw any exception  
		   int data=25/0;    
		   System.out.println(data);    
		  }    
		//catch won't be executed  
		  catch(NullPointerException e){  
		System.out.println(e);  
		}    
		  catch(ArithmeticException e) {
			  System.out.println("Logical Error: Divide by Zero");
		  }
		//executed regardless of exception occurred or not  
		 finally {  
		System.out.println("finally block is always executed"); 
		int a = 10;
		int b = 5;
		int c = a/b;				//change b to 0 and show
		System.out.println("sum = "+c);
		
		}    
		    
		System.out.println("rest of the program goes...");    
		  }    
}