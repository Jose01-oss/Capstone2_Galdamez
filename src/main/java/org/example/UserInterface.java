package org.example;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);


public void display() {
    System.out.println("What pizza size would you like?");
    System.out.println("1: small");
    System.out.println("2: medium");
    System.out.println("3: large");
    int choice = Integer.parseInt(scanner.nextLine());

    PizzaSize pizzaSize;

    switch (choice) {
    case 1: pizzaSize = PizzaSize.Small;
    break;
    case 2: pizzaSize = PizzaSize.Medium;
    break;
    case 3: pizzaSize = PizzaSize.Large;
    break;
    default:
        System.out.println("Invalid choice");
        return;
    }

    System.out.println("What crust would you like?");

}






}

