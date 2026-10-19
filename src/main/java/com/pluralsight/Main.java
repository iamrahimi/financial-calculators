package com.pluralsight;
import com.pluralsight.workbook2.FullNameParser;
import com.pluralsight.workbook2.FullNameApplication;
import com.pluralsight.workbook2.FullNameParserGUI;

import javax.swing.*;
import java.awt.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> openGUI());

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please choose an option:");
//        System.out.println("1 :- Full name application");
//        System.out.println("2 :- Full name parser");
//        System.out.println("3 :- Full name parser (GUI)");
//        int option = input.nextInt();
//
//        if(option == 1) {
//            FullNameParser fullNameParser = new FullNameParser();
//            fullNameParser.main(new String[]{});
//        }else if(option == 2) {
//            FullNameApplication fullNameApplication = new FullNameApplication();
//            fullNameApplication.main(new String[]{});
//        }else if(option == 3) {
//            FullNameParserGUI fullNameParserGUI = new FullNameParserGUI();
//            FullNameParserGUI.main(new String[]{});
//        }else {
//            System.out.println("Invalid option");
//        }
    }

    public static void openGUI() {
        JFrame frame = new JFrame("My Application");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        JLabel titleLabel = new JLabel("My Application");
        titleLabel.setFont(new Font("consolas", Font.BOLD, 22));

        JLabel instructionLabel =
                new JLabel("Please enter your full name:");

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));
    }
}