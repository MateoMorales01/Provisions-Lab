package pluralsight.data;

import pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RecieptManager {

    public static void saveReceipt(Order order) {

        // Make sure the receipts folder exists
        try {
            Files.createDirectories(Path.of("receipts"));
        } catch (IOException e) {
            System.out.println("Could not create receipts folder!");
            return;
        }

        // generate filename using current date/time
        String timestamp = generateTimestamp();
        String fileName = "receipts/" + timestamp + ".txt";

        try {
            // create the file writer + buffered writer
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // write the timestamp header
            writer.write("======= DELI-cious Receipt =======\n");
            writer.write("Timestamp: " + timestamp + "\n\n");

            // loop through all items in the order
            for (var item : order.getItems()) {
                writer.write(item.toString() + "\n\n");
            }

            // write the total cost
            writer.write("-------------------------------\n");
            writer.write("Total: $" + String.format("%.2f", order.getTotal()) + "\n");
            writer.write("===============================\n");

            // close the writer
            writer.close();
            System.out.println("Receipt saved: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing receipt file!");
            e.printStackTrace();
        }
    }

    private static String generateTimestamp() {
        // Create timestamp (yyyyMMdd-HHmmss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return LocalDateTime.now().format(formatter);
    }
}
