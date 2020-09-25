import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int totalSweets = 0;
        double moneyGain = 0;
        for (int i = 0; i < numberOfBakers; i++) {
            int cookies = 0;
            int cakes = 0;
            int waffles = 0;
            String name = scanner.nextLine();
            String typeOfSweets = scanner.nextLine();
            while (!typeOfSweets.equals("Stop baking!")) {
                int numberOfSweets = Integer.parseInt(scanner.nextLine());
                totalSweets = totalSweets + numberOfSweets;
                switch (typeOfSweets) {
                    case "cookies":
                        cookies += numberOfSweets;
                        moneyGain += numberOfSweets * 1.50;
                        break;
                    case "cakes":
                        cakes += numberOfSweets;
                        moneyGain += numberOfSweets * 7.80;
                        break;
                    case "waffles":
                        waffles += numberOfSweets;
                        moneyGain += numberOfSweets * 2.30;
                        break;
                }
                typeOfSweets = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookies, cakes, waffles);
        }
        System.out.printf("All bakery sold: %d\n", totalSweets);
        System.out.printf("Total sum for charity: %.2f lv.", moneyGain);
    }
}