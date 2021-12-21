import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJTextFieldFrame extends JFrame implements ActionListener
{
	JLabel username;
	JTextField tf;		//user name
	
	JLabel pwd;
	JPasswordField pf;	//password - *****
	
	JButton jb;			//button called submit
		
	public TestJTextFieldFrame() 
	{
		super("Text with PWD");
		username=new JLabel("Username");			//username
		tf=new JTextField(20);					//username text area
		
		pwd=new JLabel("Password");			//pwd 
		pf=new JPasswordField(20);				//pwd text area
		jb=new JButton("Login");				//button
				
		
		Container c = getContentPane();	//create a container to all buttons and textboxes
		c.setLayout(new FlowLayout());
		c.add(username);	
		c.add(tf); 
		
		c.add(pwd);		
		c.add(pf); 
			
		c.add(jb);							//for the button, event is assigned below
		jb.addActionListener(this);			//once button clicked, action is created
							
		setSize(250,250);					//displayed at 250x250 position 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb)
		{
			String userName = tf.getText();
			String password = new String(pf.getPassword()); //javax.swing.JPasswordField.getPassword()
			
			JOptionPane.showMessageDialog(null, userName + "@"+ password);
			//A component which implements standard dialog box control
			//showConfirmDialog - Asks a confirming question, like yes/no/cancel. 
			//showInputDialog - Prompt for some input.  
			//showMessageDialog - Tell the user about something that has happened.  
			//showOptionDialog - The Grand Unification of the above three.  
		}
	}
	public static void main(String args[])
	{
		new TestJTextFieldFrame();
	}
}