import java.util.Scanner;

public class TripExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double leftMoney = 0;
        for (int i = 1; i <= days; i++) {
            int products = 0;
            double startingMoney = 60 + leftMoney;
            String priceOfProduct = scanner.nextLine();
            while (!priceOfProduct.equals("Day over")) {
                double price = Double.parseDouble(priceOfProduct);
                if (price > startingMoney){
                    priceOfProduct = scanner.nextLine();
                    continue;
                }
                products++;
                startingMoney -= price;
                if (startingMoney <= 0) {
                    System.out.printf("Daily limit exceeded! You've bought %d products.%n", products);
                    break;
                }
                priceOfProduct = scanner.nextLine();
            }
            if (startingMoney > 0) {
                leftMoney = startingMoney;
                System.out.printf("Money left from today: %.2f. You've bought %d products.%n", leftMoney, products);
            }
        }
    }
}