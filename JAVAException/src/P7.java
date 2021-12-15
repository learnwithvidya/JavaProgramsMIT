import java.io.*;

public class P7 {

	public static void findFile() throws IOException {	//throws
	    // code that may produce IOException
	    File newFile = new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
}
