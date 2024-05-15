package org.fundamentals.java;

import java.util.Scanner;

public class ticketTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km, age;

        System.out.print("How many KM you want do: ");
        km = Integer.parseInt(scanner.nextLine());

        System.out.print("How old are you: ");
        age = Integer.parseInt(scanner.nextLine());

        double Price = km * 0.21;


        if (age < 18 ){
            Price -= Price * 20 / 100;
        }else if (age > 64 ) {
            Price -= Price *  40 / 100;
        }

        System.out.print("Total to pay: " + Price + " " + "$");
    }
}
