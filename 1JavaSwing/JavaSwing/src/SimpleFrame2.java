import javax.swing.*;

public class SimpleFrame2 extends JFrame			//inheritance
{
	public SimpleFrame2() 							//constructor
	{
		super("Simple Frame");						//holds value of super class (JFrame)
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new SimpleFrame2();
	}
}