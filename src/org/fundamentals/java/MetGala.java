package org.fundamentals.java;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] invited = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        String who;

        System.out.print("Who are you? :");

        who = scanner.nextLine();

        boolean isOnTheList = false;

        for (int i = 0; i < invited.length ; i++) {
            if (who.equals(invited[i])) {
                isOnTheList = true;
            }
        };
        if (isOnTheList == true){
            System.out.print("Welcome" + " " + who );
        }
        else{
            System.out.print("Torna a casa");
        }


    }
}
