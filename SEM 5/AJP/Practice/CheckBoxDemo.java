import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CheckBoxDemo implements ItemListener
{
    JFrame f;
    JCheckBox c, cpp, java, python;
    JTextArea ta;

    ArrayList<String> list = new ArrayList<>();

    CheckBoxDemo()
    {
        f = new JFrame("Languages");

        c = new JCheckBox("C");
        c.setBounds(50,50,100,30);

        cpp = new JCheckBox("C++");
        cpp.setBounds(50,90,100,30);

        java = new JCheckBox("Java");
        java.setBounds(50,130,100,30);

        python = new JCheckBox("Python");
        python.setBounds(50,170,100,30);

        ta = new JTextArea();
        ta.setBounds(180,50,180,100);

        c.addItemListener(this);
        cpp.addItemListener(this);
        java.addItemListener(this);
        python.addItemListener(this);

        f.add(c);
        f.add(cpp);
        f.add(java);
        f.add(python);
        f.add(ta);

        f.setSize(450,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        JCheckBox cb = (JCheckBox)e.getSource();

        if(cb.isSelected())
        {
            list.add(cb.getText());
        }
        else
        {
            list.remove(cb.getText());
        }

        String s = "";

        for(int i = 0; i < list.size(); i++)
        {
            if(i > 0)
                s += ", ";

            s += list.get(i);
        }

        ta.setText(s);
    }

    public static void main(String args[])
    {
        new CheckBoxDemo();
    }
}