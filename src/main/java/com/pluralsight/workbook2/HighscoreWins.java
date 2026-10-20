package com.pluralsight.workbook2;

import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {
//        Home:Visitor|21:9

        String inputValue = "Home:Visitor|21:9";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the game score (e.g. Home:Visitor|21:9): ");
        inputValue = input.nextLine();

        mkDataReadable(inputValue);

    }

    public static void mkDataReadable(String input) {
        String[] scores;
        String[] teams;
        String[] inputValueString;

        System.out.println(input);

        if(!input.isEmpty()) {
            if(input.contains(":") && input.contains("|")){
                inputValueString = input.split("\\|");

                teams = inputValueString[0].split(":");
                scores = inputValueString[1].split(":");

                if(scores.length > 0 && teams.length > 0){

                    if(Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])){
                        System.out.println("====================");
                        System.out.println("   GAME RESULTS");
                        System.out.println("====================");
                        System.out.println("Winner: " + teams[0]);
                        System.out.println("Score: " + scores[0]);
                        System.out.println("====================");

                    } else if (Integer.parseInt(scores[0]) < Integer.parseInt(scores[1])) {
                        System.out.println("====================");
                        System.out.println("   GAME RESULTS");
                        System.out.println("====================");
                        System.out.println("Winner: " + teams[1]);
                        System.out.println("Score: " + scores[1]);
                        System.out.println("====================");
                    }else {
                        System.out.println("====================");
                        System.out.println("   GAME RESULTS");
                        System.out.println("====================");
                        System.out.println("Winner: Tied" );
                        System.out.println("====================");
                    }
                }

            }
        }
    }
}
