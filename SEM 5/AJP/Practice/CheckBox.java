import javax.swing.*;
public class CheckBox
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("CheckBox");
		JCheckBox checkBox1 = new JCheckBox("c++");
		checkBox1.setBounds(50,100,100,30);
		JCheckBox checkBox2 = new JCheckBox("Java");
		checkBox2.setBounds(170,100,100,30);
		f.add(checkBox1);
		f.add(checkBox2);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}