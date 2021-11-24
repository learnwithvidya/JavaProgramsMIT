import java.util.Scanner; // import the Scanner class 

class ScannerTest {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username : "); 
    userName = obj.nextLine();   //String  
       
    System.out.println("Username is: " + userName);        
  }
}
