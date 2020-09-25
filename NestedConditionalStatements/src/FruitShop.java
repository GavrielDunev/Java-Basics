import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (dayOfTheWeek.equals("Monday")
                || dayOfTheWeek.equals("Tuesday")
                || dayOfTheWeek.equals("Wednesday")
                || dayOfTheWeek.equals("Thursday")
                || dayOfTheWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = 2.50 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("apple")) {
                price = 1.20 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("orange")) {
                price = 0.85 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapefruit")) {
                price = 1.45 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("kiwi")) {
                price = 2.70 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("pineapple")) {
                price = 5.50 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapes")) {
                price = 3.85 * quantity;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("apple")) {
                price = 1.25 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("orange")) {
                price = 0.90 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("kiwi")) {
                price = 3.00 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("pineapple")) {
                price = 5.60 * quantity;
                System.out.printf("%.2f", price);
            } else if (fruit.equals("grapes")) {
                price = 4.20 * quantity;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}

