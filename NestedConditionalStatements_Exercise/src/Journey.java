import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price;
        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.7;
                System.out.println("Somewhere in Bulgaria");
                double neededMoney = budget - price;
                System.out.printf("Camp - %.2f", neededMoney);
            } else {
                price = budget * 0.3;
                System.out.println("Somewhere in Bulgaria");
                double neededMoney = budget - price;
                System.out.printf("Hotel - %.2f", neededMoney);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.6;
                System.out.println("Somewhere in Balkans");
                double neededMoney = budget - price;
                System.out.printf("Camp - %.2f", neededMoney);
            } else {
                price = budget * 0.2;
                System.out.println("Somewhere in Balkans");
                double neededMoney = budget - price;
                System.out.printf("Hotel - %.2f", neededMoney);
            }
        } else {
                price = budget * 0.1;
                System.out.println("Somewhere in Europe");
                double neededMoney = budget - price;
                System.out.printf("Hotel - %.2f", neededMoney);
        }
    }
}
