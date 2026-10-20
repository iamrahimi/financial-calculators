
package com.pluralsight.workbook2;

import javax.swing.*;
import java.awt.*;

public class AddressBuilderGui {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> openGUI());
    }

    public static void openGUI() {

        JFrame frame = new JFrame("Address Builder");
        frame.setSize(650, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 15));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 25, 20, 25)
        );

        // Input form panel
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel titleLabel = new JLabel("Address Builder");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel nameLabel = new JLabel("Customer Name:");
        JTextField nameField = new JTextField();

        JLabel billingTitle = new JLabel("Billing Address");
        billingTitle.setFont(new Font("Arial", Font.BOLD, 17));

        JLabel billingStreetLabel = new JLabel("Billing Street:");
        JTextField billingStreetField = new JTextField();

        JLabel billingCityLabel = new JLabel("Billing City:");
        JTextField billingCityField = new JTextField();

        JLabel billingStateLabel = new JLabel("Billing State:");
        JTextField billingStateField = new JTextField();

        JLabel billingZipLabel = new JLabel("Billing Zip Code:");
        JTextField billingZipField = new JTextField();

        JLabel shippingTitle = new JLabel("Shipping Address");
        shippingTitle.setFont(new Font("Arial", Font.BOLD, 17));

        JLabel shippingStreetLabel = new JLabel("Shipping Street:");
        JTextField shippingStreetField = new JTextField();

        JLabel shippingCityLabel = new JLabel("Shipping City:");
        JTextField shippingCityField = new JTextField();

        JLabel shippingStateLabel = new JLabel("Shipping State:");
        JTextField shippingStateField = new JTextField();

        JLabel shippingZipLabel = new JLabel("Shipping Zip Code:");
        JTextField shippingZipField = new JTextField();

        JButton submitButton = new JButton("Build Address");
        JButton clearButton = new JButton("Clear");

        // Add components to input panel
        panel.add(titleLabel);
        panel.add(new JLabel(""));

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(billingTitle);
        panel.add(new JLabel(""));

        panel.add(billingStreetLabel);
        panel.add(billingStreetField);

        panel.add(billingCityLabel);
        panel.add(billingCityField);

        panel.add(billingStateLabel);
        panel.add(billingStateField);

        panel.add(billingZipLabel);
        panel.add(billingZipField);

        panel.add(shippingTitle);
        panel.add(new JLabel(""));

        panel.add(shippingStreetLabel);
        panel.add(shippingStreetField);

        panel.add(shippingCityLabel);
        panel.add(shippingCityField);

        panel.add(shippingStateLabel);
        panel.add(shippingStateField);

        panel.add(shippingZipLabel);
        panel.add(shippingZipField);

        panel.add(submitButton);
        panel.add(clearButton);

        // Customer details heading
        JLabel customerDetailsLabel =
                new JLabel("Customer Details");

        customerDetailsLabel.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        // Customer details output area
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        resultArea.setFont(
                new Font("Arial", Font.PLAIN, 17)
        );
        resultArea.setMargin(new Insets(15, 15, 15, 15));
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        resultArea.setText(
                "Your customer details will appear here."
        );

        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(550, 220));

        // Output panel
        JPanel outputPanel = new JPanel(new BorderLayout(5, 10));
        outputPanel.add(customerDetailsLabel, BorderLayout.NORTH);
        outputPanel.add(scrollPane, BorderLayout.CENTER);

        // Build Address button
        submitButton.addActionListener(e -> {

            String name = nameField.getText().trim();

            String billingStreet =
                    billingStreetField.getText().trim();
            String billingCity =
                    billingCityField.getText().trim();
            String billingState =
                    billingStateField.getText().trim();
            String billingZip =
                    billingZipField.getText().trim();

            String shippingStreet =
                    shippingStreetField.getText().trim();
            String shippingCity =
                    shippingCityField.getText().trim();
            String shippingState =
                    shippingStateField.getText().trim();
            String shippingZip =
                    shippingZipField.getText().trim();

            String billingAddress =
                    billingStreet + "\n"
                            + billingCity + ", "
                            + billingState + " "
                            + billingZip;

            String shippingAddress =
                    shippingStreet + "\n"
                            + shippingCity + ", "
                            + shippingState + " "
                            + shippingZip;

            String customerDetails =
                    "====================================\n"
                            + "           CUSTOMER DETAILS\n"
                            + "====================================\n\n"
                            + "Customer Name:\n"
                            + name + "\n\n"
                            + "BILLING ADDRESS\n"
                            + "------------------------------------\n"
                            + billingAddress + "\n\n"
                            + "SHIPPING ADDRESS\n"
                            + "------------------------------------\n"
                            + shippingAddress + "\n"
                            + "====================================";

            resultArea.setText(customerDetails);
            resultArea.setCaretPosition(0);
        });

        // Clear button
        clearButton.addActionListener(e -> {

            nameField.setText("");

            billingStreetField.setText("");
            billingCityField.setText("");
            billingStateField.setText("");
            billingZipField.setText("");

            shippingStreetField.setText("");
            shippingCityField.setText("");
            shippingStateField.setText("");
            shippingZipField.setText("");

            resultArea.setText(
                    "Your customer details will appear here."
            );
        });

        // Add panels to main panel
        mainPanel.add(panel, BorderLayout.NORTH);
        mainPanel.add(outputPanel, BorderLayout.CENTER);

        // Display window
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
