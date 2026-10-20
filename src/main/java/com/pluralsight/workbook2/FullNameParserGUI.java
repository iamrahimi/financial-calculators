package com.pluralsight.workbook2;
import javax.swing.*;
import java.awt.*;

public class FullNameParserGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createGUI());
    }

    public static void createGUI() {
        JFrame frame = new JFrame("Full Name Parser");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        JLabel titleLabel = new JLabel("Full Name Parser");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        JLabel instructionLabel =
                new JLabel("Please enter your full name:");

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));

        JButton parseButton = new JButton("Parse Name");

        JTextField firstNameField = new JTextField();
        JTextField middleNameField = new JTextField();
        JTextField lastNameField = new JTextField();

        firstNameField.setEditable(false);
        middleNameField.setEditable(false);
        lastNameField.setEditable(false);

        JLabel firstLabel = new JLabel("First Name:");
        JLabel middleLabel = new JLabel("Middle Name:");
        JLabel lastLabel = new JLabel("Last Name:");

        JLabel messageLabel = new JLabel(" ");

        parseButton.addActionListener(e -> {
            String name = nameField.getText().trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter your full name.",
                        "Missing Name",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            String[] fullName = name.split("\\s+");

            String firstName = fullName[0];
            String middleName = "(none)";
            String lastName = "(none)";

            if (fullName.length == 2) {
                lastName = fullName[1];
            } else if (fullName.length >= 3) {
                middleName = fullName[1];

                // Combine any remaining words into the last name.
                lastName = String.join(
                        " ",
                        java.util.Arrays.copyOfRange(
                                fullName, 2, fullName.length
                        )
                );
            }

            firstNameField.setText(firstName);
            middleNameField.setText(middleName);
            lastNameField.setText(lastName);
            messageLabel.setText("Name parsed successfully!");
        });

        panel.add(titleLabel);
        panel.add(instructionLabel);
        panel.add(nameField);
        panel.add(parseButton);
        panel.add(firstLabel);
        panel.add(firstNameField);
        panel.add(middleLabel);
        panel.add(middleNameField);
        panel.add(lastLabel);
        panel.add(lastNameField);
        panel.add(messageLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}

