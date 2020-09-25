import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        double beachTowel = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double umbrella = beachTowel / 3 * 2;
        double flipFlops = 0.75 * umbrella;
        double beachBag = (beachTowel + flipFlops) /3;
        double sum = beachBag + flipFlops + umbrella + beachTowel;
        double finalSum = sum - discount * 1.0 / 100 * sum;
        double difference = Math.abs(finalSum - budget);
        if (finalSum <= budget){
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", finalSum, difference);
        }else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", finalSum, difference);
        }
    }
}
