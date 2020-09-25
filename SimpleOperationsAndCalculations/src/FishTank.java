import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int litersInCm = length * width * height;
        double liters = litersInCm * 0.001;
        double fullPercent = percent * 0.01;
        double litersNeeded = liters * (1 - fullPercent);
        System.out.printf("%.3f", litersNeeded);
    }
}
