import java.awt.event.*;
import javax.swing.*;
public class BExample implements ActionListener
{
	final JTextField tf;
	BExample()
	{
		JFrame f = new JFrame("BUtton Example");
		f.setSize(400,400);
		f.setLayout(null);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b = new JButton("Click Here");
		b.setBounds(50,100,95,30);
		b.addActionListener(this);
		f.add(b);
		f.add(tf);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome to java.point");
	}
	public static void main(String args[])
	{
		BExample obj = new BExample();
	}
}