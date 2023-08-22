import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {

        // Create a JFrame window
        JFrame frame = new JFrame("Button Example");

        // Create a JButton button
        JButton button = new JButton("Click me");

        // Create a JTextField text field
        JTextField textField = new JTextField(20);

        // Add a listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the text of the button
                String buttonText = button.getText();

                // Append the button text to the text field
                textField.setText(textField.getText() + buttonText);
            }
        });

        // Add the button and text field to the frame
        frame.add(button, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);

        // Set the default close operation of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the frame and set it to be visible
        frame.pack();
        frame.setVisible(true);
    }
}