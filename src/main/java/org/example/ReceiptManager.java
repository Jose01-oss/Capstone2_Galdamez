package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    public void saveReceipt(Order order) {


        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        String fileName =
                LocalDateTime.now().format(formatter) + ".csv";

        try {

            FileWriter writer =
                    new FileWriter("receipts/" + fileName);

            writer.write("Item,Price\n");

            for (Pizza pizza : order.getPizzas()) {

                writer.write(
                        "Pizza," +
                                String.format("%.2f",
                                        pizza.calculatePrice()) +
                                "\n"
                );
            }


            for (Drink drink : order.getDrinks()) {

                writer.write(
                        drink.getName() + "," +
                                String.format("%.2f",
                                        drink.getPrice()) +
                                "\n"
                );
            }

            for (GarlicKnots knots : order.getGarlicKnots()) {

                writer.write(
                        "Garlic Knots x" +
                                knots.getQuantity() + "," +
                                String.format("%.2f",
                                        knots.getPrice()) +
                                "\n"
                );
            }


            writer.write(
                    "TOTAL," +
                            String.format("%.2f",
                                    order.getTotalPrice())
            );

            writer.close();

            System.out.println("Receipt saved.");

        }
        catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
    }
}

