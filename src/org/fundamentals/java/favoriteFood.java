package org.fundamentals.java;

import java.util.Arrays;

public class favoriteFood {
    public static void main(String[] args) {
        String[] food = {"Pizza", "Lasagna", "Cheeseburger", "Carbonara", "Amatriciana", "Sushi", "Schiacciata"};
        System.out.println(Arrays.toString(food));

        int foodLength = food.length;
        System.out.println("Lunghezza Array : " + " " + foodLength);

        System.out.println("Top :" + " " + food[0]);

        System.out.println("Bot :" + " " + food[7 - 1]);

        System.out.println("Mid :" + " " + food[3]);
    }
}
