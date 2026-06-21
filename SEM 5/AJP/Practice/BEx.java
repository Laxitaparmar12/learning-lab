import java.awt.event.*;
import javax.swing.*;
public class BEx implements ActionListener
{
	final JTextField tf;
	final JLabel lb;
	BEx()
	{
		JFrame f = new JFrame("Password Example");
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		
		lb = new JLabel("LDRP-ITR");
		lb.setBounds(50,100,95,30);
		
		JButton b = new JButton("Click Here");
		b.setBounds(50,100,95,30);
		b.addActionListener(this);
		f.add(tf);
		f.add(lb);
		f.add(b);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = lb.getText();
		tf.setText(s);
	}
	public static void main(String args[])
	{
		BEx obj = new BEx();
	}
}