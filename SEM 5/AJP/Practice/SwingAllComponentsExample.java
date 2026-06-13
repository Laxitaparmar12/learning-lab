import javax.swing.*;

public class SwingAllComponentsExample {

    public static void main(String[] args) {

        // Pluggable Look and Feel
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        // JFrame
        JFrame frame = new JFrame("Student Registration Form");

        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        JLabel lblName = new JLabel("Student Name:");
        lblName.setBounds(50, 50, 120, 30);

        // JTextField (JTextComponent)
        JTextField txtName = new JTextField();
        txtName.setBounds(180, 50, 200, 30);

        // JLabel
        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(50, 100, 120, 30);

        // JRadioButton
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(180, 100, 80, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(270, 100, 100, 30);

        // ButtonGroup
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // JLabel
        JLabel lblSkills = new JLabel("Skills:");
        lblSkills.setBounds(50, 150, 120, 30);

        // JCheckBox
        JCheckBox java = new JCheckBox("Java");
        java.setBounds(180, 150, 100, 30);

        JCheckBox python = new JCheckBox("Python");
        python.setBounds(280, 150, 100, 30);

        JCheckBox cpp = new JCheckBox("C++");
        cpp.setBounds(380, 150, 100, 30);

        // JLabel
        JLabel lblStatus = new JLabel("Account Status:");
        lblStatus.setBounds(50, 200, 120, 30);

        // JToggleButton
        JToggleButton toggle =
                new JToggleButton("Inactive");
        toggle.setBounds(180, 200, 120, 30);

        toggle.addActionListener(e -> {

            if(toggle.isSelected()) {
                toggle.setText("Active");
            } else {
                toggle.setText("Inactive");
            }

        });

        // JButton
        JButton submit =
                new JButton("Submit");
        submit.setBounds(180, 280, 120, 40);

        // Output JLabel
        JLabel result =
                new JLabel();
        result.setBounds(50, 350, 500, 30);

        // Controller (MVC)
        submit.addActionListener(e -> {

            // Model (Data)
            String name = txtName.getText();

            String gender = "";

            if(male.isSelected())
                gender = "Male";

            if(female.isSelected())
                gender = "Female";

            String skills = "";

            if(java.isSelected())
                skills += "Java ";

            if(python.isSelected())
                skills += "Python ";

            if(cpp.isSelected())
                skills += "C++ ";

            String status =
                    toggle.isSelected()
                    ? "Active"
                    : "Inactive";

            // View Update
            result.setText(
                "Name: " + name +
                " | Gender: " + gender +
                " | Skills: " + skills +
                " | Status: " + status
            );
        });

        // Add Components
        frame.add(lblName);
        frame.add(txtName);

        frame.add(lblGender);
        frame.add(male);
        frame.add(female);

        frame.add(lblSkills);
        frame.add(java);
        frame.add(python);
        frame.add(cpp);

        frame.add(lblStatus);
        frame.add(toggle);

        frame.add(submit);
        frame.add(result);

        frame.setVisible(true);
    }
}