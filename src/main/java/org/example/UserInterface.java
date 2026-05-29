package org.example;

import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);


    public void display() {
        List<Pizza> pizzaOrderList = new ArrayList<>();
        List<Drink> drinkOrderList = new ArrayList<>();
        List<GarlicKnots> garlicKnotOrderList = new ArrayList<>();

        while (true) {
            System.out.println("---Pizzeria---");
            System.out.println("1: build pizza");
            System.out.println("2: add drink");
            System.out.println("3: add garlic knot");
            System.out.println("4: check out");
            System.out.println("5: Exit");
            int mainMenuChoice = Integer.parseInt(scanner.nextLine());

            if (mainMenuChoice == 4) {
                break;
            }
            switch (mainMenuChoice) {
                case 1:
                    PizzaSize pizzaSize = null;
                    Crust crustSelection = null;
                    boolean stuffedCrust = false;
                    Sauces sauceSelection = null;

                    CheeseSelection finalCheeseSelection = null;

                    System.out.println("What pizza size would you like?");
                    System.out.println("1: small");
                    System.out.println("2: medium");
                    System.out.println("3: large");
                    int choice = Integer.parseInt(scanner.nextLine());



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
                            continue;
                    }

                    System.out.println("What crust would you like?");
                    System.out.println("1: thin");
                    System.out.println("2: regular");
                    System.out.println("3: thick");
                    System.out.println("4: cauliflower");
                    int choice2 = Integer.parseInt(scanner.nextLine());


                    switch (choice2) {
                        case 1:
                            crustSelection = Crust.THIN;
                            break;
                        case 2:
                            crustSelection = Crust.REGULAR;
                            break;
                        case 3:
                            crustSelection = Crust.THICK;
                            break;
                        case 4:
                            crustSelection = Crust.CAULIFLOWER;
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }

                    System.out.println("Do you want stuffed crust?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int CrustChoice = Integer.parseInt(scanner.nextLine());


                    if (CrustChoice == 1) {
                        stuffedCrust = true;
                    } else if (CrustChoice == 2) {
                        stuffedCrust = false;
                    } else {
                        System.out.println("Invalid choice");
                        continue;
                    }
                    CrustSelection finalCrustSelection = new CrustSelection(crustSelection, stuffedCrust);

                    System.out.println("What type of sauce would you like?");
                    System.out.println("1: Marinara");
                    System.out.println("2: Alfredo");
                    System.out.println("3: Pesto");
                    System.out.println("4: BBQ");
                    System.out.println("5: Buffalo");
                    System.out.println("6: Olive oil");

                    int choice3 = Integer.parseInt(scanner.nextLine());

                    switch (choice3) {
                        case 1:
                            sauceSelection = Sauces.MARINARA;
                            break;
                        case 2:
                            sauceSelection = Sauces.ALFREDO;
                            break;
                        case 3:
                            sauceSelection = Sauces.PESTO;
                            break;
                        case 4:
                            sauceSelection = Sauces.BBQ;
                            break;
                        case 5:
                            sauceSelection = Sauces.BUFFALO;
                            break;
                        case 6:
                            sauceSelection = Sauces.OLIVE_OIL;
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    SauceSelection finalSauceSelection = new SauceSelection(sauceSelection);

                    System.out.println("Select a cheese for the pizza");
                    System.out.println("0: finish");
                    System.out.println("1: Mozzarella");
                    System.out.println("2: Parmesan");
                    System.out.println("3: Ricotta");
                    System.out.println("4: Goat cheese");
                    System.out.println("5: Buffalo");

                    int choice4 = Integer.parseInt(scanner.nextLine());

                    Cheese cheeseOption = null;

                    if (choice4 == 0) {
                        System.out.println("No cheese selected.");
                    } else {
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
                    }
                    boolean isExtraCheese = false;

                    if (cheeseOption != null) {
                        System.out.println("Would you like extra " + cheeseOption + "?");
                        System.out.println("1: Yes");
                        System.out.println("2: No");
                        int extraChoice = Integer.parseInt(scanner.nextLine());

                        isExtraCheese = (extraChoice == 1);

                        if (isExtraCheese) {
                            System.out.println("Added Extra " + cheeseOption);
                        } else {
                            System.out.println("Added standard " + cheeseOption);
                        }
                    }
                    finalCheeseSelection = new CheeseSelection(cheeseOption, isExtraCheese);

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
                            case 1:
                                meatOption = Meat.PEPPERONI;
                                break;
                            case 2:
                                meatOption = Meat.SAUSAGE;
                                break;
                            case 3:
                                meatOption = Meat.HAM;
                                break;
                            case 4:
                                meatOption = Meat.BACON;
                                break;
                            case 5:
                                meatOption = Meat.CHICKEN;
                                break;
                            case 6:
                                meatOption = Meat.MEATBALL;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                continue;
                        }

                        System.out.println("Would you like extra " + meatOption + "?");
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
                    boolean hasAnyExtraMeat = meatMap.containsValue(true);
                    MeatSelection finalMeatSelection = new MeatSelection(meatMap, hasAnyExtraMeat);
                    ArrayList<RegularToppings> toppings = new ArrayList<>();

                    while (true) {
                        System.out.println("Select toppings for your pizza or 0 to finish:");
                        System.out.println("0: finish");
                        System.out.println("1: Onions");
                        System.out.println("2: Mushrooms");
                        System.out.println("3: Bell Peppers");
                        System.out.println("4: Olives");
                        System.out.println("5: Tomatoes");
                        System.out.println("6: Spinach");
                        System.out.println("7: Basil");
                        System.out.println("8: Pineapple");
                        System.out.println("9: Anchovies");

                        int choice6 = Integer.parseInt(scanner.nextLine());
                        RegularToppings toppingOption;

                        if (choice6 == 0) {
                            break;
                        }
                        switch (choice6) {
                            case 1:
                                toppingOption = RegularToppings.ONIONS;
                                break;
                            case 2:
                                toppingOption = RegularToppings.MUSHROOMS;
                                break;
                            case 3:
                                toppingOption = RegularToppings.BELL_PEPPERS;
                                break;
                            case 4:
                                toppingOption = RegularToppings.OLIVES;
                                break;
                            case 5:
                                toppingOption = RegularToppings.TOMATOES;
                                break;
                            case 6:
                                toppingOption = RegularToppings.SPINACH;
                                break;
                            case 7:
                                toppingOption = RegularToppings.BASIL;
                                break;
                            case 8:
                                toppingOption = RegularToppings.PINEAPPLE;
                                break;
                            case 9:
                                toppingOption = RegularToppings.ANCHOVIES;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                continue;
                        }
                        System.out.println(toppingOption + " added");
                        toppings.add(toppingOption);

                    }
                    RegularToppingSelection finalToppingSelection = new RegularToppingSelection(toppings);

                    Pizza newPizza = new Pizza(
                            finalCheeseSelection,
                            finalCrustSelection,
                            finalMeatSelection,
                            finalToppingSelection,
                            finalSauceSelection,
                            pizzaSize
                    );

                    pizzaOrderList.add(newPizza);
                    System.out.println("Pizza added to your cart!");
                    break;

                case 2:
                    String selectedFlavor = "";
                    while (true) {
                        System.out.println("--- Select a Drink Flavor ---");
                        System.out.println("1: Pepsi");
                        System.out.println("2: Sprite");
                        System.out.println("3: Starry");
                        System.out.println("4: Fanta");

                        try {
                            int flavorChoice = Integer.parseInt(scanner.nextLine());
                            if (flavorChoice == 1) { selectedFlavor = "Pepsi";
                                break; }
                            else if (flavorChoice == 2) { selectedFlavor = "Sprite";
                                break; }
                            else if (flavorChoice == 3) { selectedFlavor = "Starry";
                                break; }
                            else if (flavorChoice == 4) { selectedFlavor = "Fanta";
                                break; }
                            else { System.out.println("Invalid choice. Please select 1 to 4"); }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }

                    DrinkSize selectedSize = null;
                    while (true) {
                        System.out.println("\n--- Select a Size ---");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");

                        try {
                            int drinkSizeChoice = Integer.parseInt(scanner.nextLine());
                            if (drinkSizeChoice == 1) { selectedSize = DrinkSize.SMALL;
                                break; }
                            else if (drinkSizeChoice == 2) { selectedSize = DrinkSize.MEDIUM;
                                break; }
                            else if (drinkSizeChoice == 3) { selectedSize = DrinkSize.LARGE;
                                break; }
                            else { System.out.println("Invalid choice. Please select 1 to 3."); }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid integer.");
                        }
                    }

                    Drink newDrink = new Drink(selectedSize, selectedFlavor);
                    drinkOrderList.add(newDrink);

                    System.out.println("\n" + newDrink.getSize() + " " + newDrink.getName() + " added to your cart!");
                    break;

                    case 3:
                        while (true) {
                            System.out.println("--- Add Garlic Knots---");
                            System.out.println("How many garlic knots would you like?");
                            try {
                                int addedKnots = Integer.parseInt(scanner.nextLine());
                                if (addedKnots > 0) {
                                    GarlicKnots knotsOrder = new GarlicKnots(addedKnots);
                                    garlicKnotOrderList.add(knotsOrder);

                                    System.out.println(addedKnots + " garlic knots  added");
                                    break;
                                } else if (addedKnots == 0) {
                                    System.out.println("No garlic knots added.");
                                    break;
                                } else {
                                    System.out.println("Invalid quantity. Enter a positive number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please enter a valid whole number.");
                            }
                        }
                        break;
                case 5:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Invalid choice. Please select 1 to 5");


            }


            System.out.println("Receipt");

            double totalCost = 0.0;

            if (!pizzaOrderList.isEmpty()) {
                System.out.println("Pizzas Built: " + pizzaOrderList.size());
                for (int i = 0; i < pizzaOrderList.size(); i++) {
                    Pizza p = pizzaOrderList.get(i);
                    double pizzaPrice = p.calculatePrice();
                    System.out.printf("  - Custom Pizza #%d (%s): $%.2f\n", (i + 1), p.getSize(), pizzaPrice);
                    totalCost += pizzaPrice;
                }
            }

            if (!drinkOrderList.isEmpty()) {
                System.out.println("\nDrinks Ordered:");
                for (Drink d : drinkOrderList) {
                    System.out.println("  - " + d);
                    totalCost += d.getPrice();
                }
            }

            if (!garlicKnotOrderList.isEmpty()) {
                System.out.println("\nSides:");
                for (GarlicKnots gk : garlicKnotOrderList) {
                    System.out.println("  - " + gk.getQuantity() + " Garlic Knot(s): $" + String.format("%.2f", gk.getPrice()));
                    totalCost += gk.getPrice();
                }
            }

            System.out.printf("Total Amount Due: $%.2f\n", totalCost);

            Order completedOrder = new Order(pizzaOrderList, drinkOrderList, garlicKnotOrderList, totalCost);
            ReceiptManager rm = new ReceiptManager();
            rm.saveReceipt(completedOrder);




        }
    }

}














