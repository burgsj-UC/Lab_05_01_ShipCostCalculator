import java.util.Scanner;


public class ShipCostCalculator {
    public static void main(String[] args) {

        double itemCost;
        double shipCost = 0;
        double SHIPPING_RATE = 0.02;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            if (itemCost >= 100) {
                shipCost = 0;
            }
            else {
                shipCost = itemCost * SHIPPING_RATE;
            }
        }
        System.out.print("Your shipping cost will be: $" + shipCost);
    }
}