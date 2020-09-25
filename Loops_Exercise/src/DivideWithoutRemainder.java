import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                first++;
            }
            if (number % 3 == 0) {
                second++;
            }
            if (number % 4 == 0) {
                third++;
            }
        }
        double p1 = first * 1.0 / n * 100;
        double p2 = second * 1.0 / n * 100;
        double p3 = third * 1.0 / n * 100;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
    }
}
