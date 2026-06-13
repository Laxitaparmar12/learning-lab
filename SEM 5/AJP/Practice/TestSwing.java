import javax.swing.*;
class TestSwing
{
	public static void main(String args[])
	{
		//This is for create a frame basic knowledge
		JFrame frame = new JFrame("My world");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//This is for create a label
		JLabel label = new JLabel("Welcome to User");
		label.setBounds(100,50,200,30);
        frame.add(label);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		
		
	}
}
