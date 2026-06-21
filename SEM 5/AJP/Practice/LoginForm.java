import java.awt.event.*;
import javax.swing.*;

public class LoginForm implements ActionListener
{
    JFrame f;
    JLabel l1, l2, l3;
    JTextField tf;
    JPasswordField pf;
    JButton b;

    LoginForm()
    {
        f = new JFrame("Login Form");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("User Name:");
        l1.setBounds(50, 50, 100, 30);

        tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);

        pf = new JPasswordField();
        pf.setBounds(150, 100, 150, 30);

        b = new JButton("Login");
        b.setBounds(150, 150, 100, 30);
        b.addActionListener(this);

        l3 = new JLabel();
        l3.setBounds(50, 200, 300, 30);

        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(pf);
        f.add(b);
        f.add(l3);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String username = tf.getText();

        String password = new String(pf.getPassword());

        l3.setText("Welcome " + username +
                   " and your password is " + password);
    }

    public static void main(String args[])
    {
        new LoginForm();
    }
}