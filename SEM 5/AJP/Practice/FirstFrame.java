import javax.swing.*;
class FirstFrame
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		f.setVisible(true);//for visiblity
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350,400);
		f.setLocation(200,200);
		f.setTitle("FirstFrame");
	}
}