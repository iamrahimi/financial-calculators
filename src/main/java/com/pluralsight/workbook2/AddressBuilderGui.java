package com.pluralsight.workbook2;
import javax.swing.*;
import java.awt.*;

public class AddressBuilderGui {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> openGUI());
    }

    public static void openGUI() {
        JFrame frame = new JFrame("Address Builder");
        frame.setSize(600, 950);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        JLabel titleLabel = new JLabel("Address Builder");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        JLabel nameLabel = new JLabel("Customer Name:");
        JTextField nameField = new JTextField();

        JLabel billingTitle = new JLabel("Billing Address");
        billingTitle.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel billingStreetLabel = new JLabel("Billing Street:");
        JTextField billingStreetField = new JTextField();

        JLabel billingCityLabel = new JLabel("Billing City:");
        JTextField billingCityField = new JTextField();

        JLabel billingStateLabel = new JLabel("Billing State:");
        JTextField billingStateField = new JTextField();

        JLabel billingZipLabel = new JLabel("Billing Zip Code:");
        JTextField billingZipField = new JTextField();

        JLabel shippingTitle = new JLabel("Shipping Address");
        shippingTitle.setFont(new Font("Arial", Font.BOLD, 16));

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

        JTextArea resultArea = new JTextArea(8, 30);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));

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

        panel.add(new JLabel("Customer Details:"));
        panel.add(new JLabel(""));

        panel.add(new JScrollPane(resultArea));
        panel.add(new JLabel(""));

        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();

            StringBuilder billingAddressBuilder = new StringBuilder();
            billingAddressBuilder.append(
                    billingStreetField.getText().trim() + "\n"
            );
            billingAddressBuilder.append(
                    billingCityField.getText().trim() + ", "
            );
            billingAddressBuilder.append(
                    billingStateField.getText().trim() + " "
            );
            billingAddressBuilder.append(
                    billingZipField.getText().trim()
            );

            StringBuilder shippingAddressBuilder = new StringBuilder();
            shippingAddressBuilder.append(
                    shippingStreetField.getText().trim() + "\n"
            );
            shippingAddressBuilder.append(
                    shippingCityField.getText().trim() + ", "
            );
            shippingAddressBuilder.append(
                    shippingStateField.getText().trim() + " "
            );
            shippingAddressBuilder.append(
                    shippingZipField.getText().trim()
            );

            String billingString = billingAddressBuilder.toString();
            String shippingString = shippingAddressBuilder.toString();

            resultArea.setText(
                    "========================================\n"
                            + "           CUSTOMER DETAILS\n"
                            + "========================================\n\n"
                            + "Customer Name:\n  " + name + "\n\n"
                            + "Billing Address:\n" + billingString + "\n\n"
                            + "Shipping Address:\n" + shippingString + "\n\n"
                            + "========================================"
            );
        });

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

            resultArea.setText("");
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}

