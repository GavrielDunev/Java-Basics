import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceForOneStatist = Double.parseDouble(scanner.nextLine());
        double moneyStatists = priceForOneStatist * numberStatists;
        double decor = 0.1 * budget;
        if (numberStatists > 150) {
            moneyStatists = moneyStatists - 0.1 * moneyStatists;
        }

        double totalMoney = decor + moneyStatists;

        if (totalMoney > budget) {
                double needMoney = totalMoney - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", needMoney);
            } else {
                double moneyLeft = budget - totalMoney;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
            }
        }
    }
