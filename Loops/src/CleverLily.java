import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceOfLaundry = Double.parseDouble(scanner.nextLine());
        int priceForOneToy = Integer.parseInt(scanner.nextLine());
        int priceEven = 0;
        int Odd = 0;
        int even = 0;
        int moreMoney = 10;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                even = even + 1;
                priceEven = priceEven + moreMoney;
                moreMoney = moreMoney + 10;
            } else {
                Odd = Odd + 1;
            }
        }
        int moneyEven = priceEven - even;
        int priceForToys = Odd * priceForOneToy;
        int total = moneyEven + priceForToys;
        if (total >= priceOfLaundry) {
            double leftMoney = total - priceOfLaundry;
            System.out.printf("Yes! %.2f", leftMoney);
        } else {
            double neededMoney = priceOfLaundry - total;
            System.out.printf("No! %.2f", neededMoney);
        }
    }
}
