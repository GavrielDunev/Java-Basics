import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double sum = puzzels * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        int numberToys = puzzels + dolls + bears + minions + trucks;
        if (numberToys >= 50) {
            double discount = 0.25 * sum;
            double finalPrice = sum - discount;
            double rent = 0.1 * finalPrice;
            double profit = finalPrice - rent;
            if (profit >= priceExcursion) {
                double leftMoney = profit - priceExcursion;
                System.out.printf("Yes! %.2f lv left.", leftMoney);
            } else if (profit < priceExcursion){
                double neededMoney = priceExcursion - profit;
                System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
            }
        } else if (numberToys < 50) {
            double rent = 0.1 * sum;
            double profit = sum - rent;
            if (profit >= priceExcursion) {
                double leftMoney = profit - priceExcursion;
                System.out.printf("Yes! %.2f lv left.", leftMoney);
            } else if (profit < priceExcursion){
                double neededMoney = priceExcursion - profit;
                System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
            }
        }
    }
}