import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double personalExpense = Double.parseDouble(scanner.nextLine());

        double neededMoney = 0.3 * income;
        double moneySavedEachMonth = income - (personalExpense + neededMoney);
        double totalSavedMoney = moneySavedEachMonth * months;
        double percent = moneySavedEachMonth / income * 100;
        System.out.printf("She can save %.2f%%\n",percent);
        System.out.printf("%.2f", totalSavedMoney);
    }
}
