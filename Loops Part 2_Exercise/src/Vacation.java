import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int numberSpend = 0;
        while (money < neededMoney) {
            String action = scanner.nextLine();
            days++;
            double sum = Double.parseDouble(scanner.nextLine());
            if (action.equals("save")) {
                money = money + sum;
                numberSpend = 0;
            } else {
                numberSpend++;
                money = money - sum;
                if (money < sum) {
                    money = 0;
                }
            }
            if (numberSpend == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", days);
                break;
            }
        }
        if (money >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}