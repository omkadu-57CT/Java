import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P5 extends JFrame implements ActionListener {

    JLabel nameLabel, rollLabel, marksLabel, resultLabel;
    JTextField nameField, rollField, marksField;
    JButton submitButton;

    public P5() {

        setTitle("Student Registration System");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        nameLabel = new JLabel("Student Name:");
        rollLabel = new JLabel("Roll Number:");
        marksLabel = new JLabel("Marks:");

        nameField = new JTextField();
        rollField = new JTextField();
        marksField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        resultLabel = new JLabel("Enter student details.");

        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(marksLabel);
        add(marksField);

        add(submitButton);
        add(new JLabel(""));

        add(resultLabel);
        add(new JLabel(""));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText().trim();
        String roll = rollField.getText().trim();
        String marksText = marksField.getText().trim();

        if (name.isEmpty() || roll.isEmpty() || marksText.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Please fill in all fields!",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        try {
            double marks = Double.parseDouble(marksText);

            if (marks < 0 || marks > 100) {
                JOptionPane.showMessageDialog(
                    this,
                    "Marks must be between 0 and 100!",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            String grade;

            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 75) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            String message = "Name: " + name
                    + "\nRoll Number: " + roll
                    + "\nMarks: " + marks
                    + "\nGrade: " + grade;

            JOptionPane.showMessageDialog(
                this,
                message,
                "Student Details",
                JOptionPane.INFORMATION_MESSAGE
            );

            resultLabel.setText("Grade: " + grade);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid numeric marks!",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new P5());
    }
}
