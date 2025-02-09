import java.util.Scanner;


public class ShipCostCalculator {
    public static void main(String[] args) {

        double itemCost = 0;
        double shipCost = 0;
        double SHIPPING_RATE = 0.02;
        double totalCost;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();
            if (itemCost >= 100) {
                shipCost = 0;
            }
            else {
                shipCost = itemCost * SHIPPING_RATE;
            }
        }

        totalCost = itemCost + shipCost;

        System.out.println("Your shipping cost will be: $" + shipCost);
        System.out.println("Your total cost will be: $" + totalCost);
    }
}