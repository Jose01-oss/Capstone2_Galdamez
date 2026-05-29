package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReceiptManager {
    public void saveReceipt(Order order) {
        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdir();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = LocalDateTime.now().format(formatter) + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(new File(folder, fileName)))) {

            writer.println("=================================");
            writer.println("          ORDER RECEIPT          ");
            writer.println("=================================");

            if (order.getPizzas() != null && !order.getPizzas().isEmpty()) {
                writer.println("PIZZAS ORDERED:");
                int count = 1;
                for (Pizza p : order.getPizzas()) {
                    double pizzaPrice = p.calculatePrice();
                    writer.printf("  - Custom Pizza #%d (%s): $%.2f", count++, p.getSize(), pizzaPrice);
                    writer.printf("    * Crust: %s %s", p.getCrust().getCrust(), p.getCrust().isStuffedCrust() ? "[STUFFED]" : "");
                    writer.printf("    * Sauce: %s", p.getSauce().getSauce());

                    String cheeseName = (p.getCheese().getCheese() != null) ? p.getCheese().getCheese().toString() : "None";
                    writer.printf("Cheese: %s %s", cheeseName, p.getCheese().isAddExtraCheese() ? "(EXTRA)" : "");

                    writer.print("    * Meats: ");
                    if (p.getMeat().getMeats() == null || p.getMeat().getMeats().isEmpty()) {
                        writer.println("None");
                    } else {
                        List<String> meatDetails = new ArrayList<>();
                        p.getMeat().getMeats().forEach((meat, isExtra) -> {
                            meatDetails.add(meat + (isExtra ? " (Extra)" : ""));
                        });
                        writer.println(String.join(", ", meatDetails));
                    }

                    writer.print(" Toppings: ");
                    if (p.getRegularTopping().getRegularToppings() == null || p.getRegularTopping().getRegularToppings().isEmpty()) {
                        writer.println("None");
                    } else {
                        List<String> toppingNames = new ArrayList<>();
                        for (RegularToppings rt : p.getRegularTopping().getRegularToppings()) {
                            toppingNames.add(rt.toString());
                        }
                        writer.println(String.join(", ", toppingNames));
                    }
                    writer.println();
                }
            }

            if (order.getDrinks() != null && !order.getDrinks().isEmpty()) {
                writer.println("DRINKS ORDERED:");
                for (Drink drink : order.getDrinks()) {
                    writer.println("  - " + drink.toString());
                }
                writer.println();
            }

            if (order.getGarlicKnots() != null && !order.getGarlicKnots().isEmpty()) {
                writer.println("SIDES:");
                for (GarlicKnots knots : order.getGarlicKnots()) {
                    writer.printf("  - %d Garlic Knot(s): $%.2f\n", knots.getQuantity(), knots.getPrice());
                }
                writer.println();
            }

            writer.println("---------------------------------");
            writer.printf("Total Amount Due: $%.2f\n", order.getTotalPrice());


            System.out.println("File saved cleanly to: receipts/" + fileName);

        } catch (IOException e) {
            System.out.println("CRITICAL: Error occurred while writing text receipt.");
            e.printStackTrace();
        }
    }
}
