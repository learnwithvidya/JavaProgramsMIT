import javax.swing.*;

public class SimpleFrame1 
{
	public SimpleFrame1()							//constructor
	{
		JFrame frame=new JFrame("Simple Frame");	//object to JFrame
		frame.setSize(250,250);						//Set the window size	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exits on close window
		frame.setLocation(300,300);					//Sets the location of the 
													//point to the specified location
		frame.setVisible(true);						//makes appearance
	}
	
	public static void main(String args[])
	{
		new SimpleFrame1(); // same as SimpleFrame1 frame = new SimpleFrame1();
	}
}