import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        if (season.equals("Spring")) {
            rent = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            rent = 4200;
        } else if (season.equals("Winter")) {
            rent = 2600;
        }

        if (fishers <= 6) {
            rent = rent * 0.9;
        } else if (fishers <= 11) {
            rent = rent * 0.85;
        } else {
            rent = rent * 0.75;
        }

        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            rent *= 0.95;
        }

        if (budget >= rent) {
            double leftMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        }else {
            double neededMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
