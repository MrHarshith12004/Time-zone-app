import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class WorldTime {
    public static void main(String[] args) {
        // Get the current date and time
        ZonedDateTime now = ZonedDateTime.now();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a time zone
        System.out.println("Enter a time zone (e.g., 'America/Los_Angeles'): ");
        String timeZone = scanner.nextLine();

        // Display the current date and time in the user-specified time zone
        try {
            System.out.println("Current time in " + timeZone + ": " + now.withZoneSameInstant(ZoneId.of(timeZone)));
        } catch (Exception e) {
            System.out.println("Invalid time zone entered.");
        }

        // Close the scanner
        scanner.close();
    }
}