import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;
        int totalWins = 0;
        int totalLoses = 0;
        for (int i = 1; i <= days; i++) {
            double moneyForToday = 0;
            int wins = 0;
            int loses = 0;
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    wins++;
                    totalWins++;
                    moneyForToday += 20;
                } else {
                    loses++;
                    totalLoses++;
                }
                sport = scanner.nextLine();
            }
            if (wins > loses) {
                moneyForToday += 0.1 * moneyForToday;
            }
            totalMoney += moneyForToday;
        }
        if (totalWins > totalLoses) {
            totalMoney += 0.2 * totalMoney;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}