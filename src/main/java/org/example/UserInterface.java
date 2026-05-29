package org.example;

import java.util.*;

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
            case 1:
                pizzaSize = PizzaSize.Small;
                break;
            case 2:
                pizzaSize = PizzaSize.Medium;
                break;
            case 3:
                pizzaSize = PizzaSize.Large;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("What crust would you like?");
        System.out.println("1: thin");
        System.out.println("2: regular");
        System.out.println("3: thick");
        System.out.println("4: cauliflower");
        int choice2 = Integer.parseInt(scanner.nextLine());

        Crust crust;
        switch (choice2) {
            case 1:
                crust = Crust.THIN;
                break;
            case 2:
                crust = Crust.REGULAR;
                break;
            case 3:
                crust = Crust.THICK;
                break;
            case 4:
                crust = Crust.CAULIFLOWER;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Do you want stuffed crust?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        int CrustChoice = Integer.parseInt(scanner.nextLine());
        boolean stuffedCrust;

        if (CrustChoice == 1) {
            stuffedCrust = true;
        } else if (CrustChoice == 2) {
            stuffedCrust = false;
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("What type of sauce would you like?");
        System.out.println("1: Marinara");
        System.out.println("2: Alfredo");
        System.out.println("3: Pesto");
        System.out.println("4: BBQ");
        System.out.println("5: Buffalo");
        System.out.println("6: Olive oil");

        int choice3 = Integer.parseInt(scanner.nextLine());
        Sauces sauce;
        switch (choice3) {
            case 1:
                sauce = Sauces.MARINARA;
                break;
            case 2:
                sauce = Sauces.ALFREDO;
                break;
            case 3:
                sauce = Sauces.PESTO;
                break;
            case 4:
                sauce = Sauces.BBQ;
                break;
            case 5:
                sauce = Sauces.BUFFALO;
                break;
            case 6:
                sauce = Sauces.OLIVE_OIL;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        Map<Cheese, Boolean> cheeseMap = new HashMap<>();
        while (true) {
            System.out.println("Select a cheese for the pizza or 0 to finish");
            System.out.println("0: finish");
            System.out.println("1: Mozzarella");
            System.out.println("2: Parmesan");
            System.out.println("3: Ricotta");
            System.out.println("4: Goat cheese");
            System.out.println("5: Buffalo");

            int choice4 = Integer.parseInt(scanner.nextLine());

            Cheese cheeseOption;

            if (choice4 == 0) {
                break;
            }
            switch (choice4) {
                case 1:
                    cheeseOption = Cheese.MOZZARELLA;
                    break;
                case 2:
                    cheeseOption = Cheese.PARMESAN;
                    break;
                case 3:
                    cheeseOption = Cheese.RICOTTA;
                    break;
                case 4:
                    cheeseOption = Cheese.GOAT_CHEESE;
                    break;
                case 5:
                    cheeseOption = Cheese.BUFFALO;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Would you like extra " + cheeseOption + "?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int extraChoice = Integer.parseInt(scanner.nextLine());

            boolean isExtra = (extraChoice == 1);

            cheeseMap.put(cheeseOption, isExtra);
            if (isExtra) {
                System.out.println("Added Extra " + cheeseOption);
            } else {
                System.out.println("Added standard " + cheeseOption);
            }


        }
        Map<Meat, Boolean> meatMap = new HashMap<>();

        while (true) {
            System.out.println("Select meats for your pizza or 0 to finish:");
            System.out.println("0: finish");
            System.out.println("1: Pepperoni");
            System.out.println("2: Sausage");
            System.out.println("3: Ham");
            System.out.println("4: Bacon");
            System.out.println("5: Chicken");
            System.out.println("6: Meatball");

            int choice5 = Integer.parseInt(scanner.nextLine());
            Meat meatOption;

            if (choice5 == 0) {
                break;
            }
            switch (choice5) {
                case 1: meatOption = Meat.PEPPERONI;
                break;
                case 2: meatOption = Meat.SAUSAGE;
                break;
                case 3: meatOption = Meat.HAM;
                break;
                case 4: meatOption = Meat.BACON;
                break;
                case 5: meatOption = Meat.CHICKEN;
                break;
                case 6: meatOption = Meat.MEATBALL;
                break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Would you like extra " + meatOption + "? (Adds $2.00)");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int extraMeatChoice = Integer.parseInt(scanner.nextLine());

            boolean isExtraMeat = (extraMeatChoice == 1);

            meatMap.put(meatOption, isExtraMeat);

            if (isExtraMeat) {
                System.out.println("Added Extra " + meatOption);
            } else {
                System.out.println("Added standard " + meatOption);
            }
        }


    }
}














