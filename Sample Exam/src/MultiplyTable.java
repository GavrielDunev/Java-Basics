import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentI = number % 10;
        int currentX = number / 10 % 10;
        int currentT = number / 100 % 10;
        for (int i = 1; i <= currentI; i++) {
            for (int x = 1; x <= currentX; x++) {
                for (int t = 1; t <= currentT; t++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, x, t, i * x * t);
                }
            }
        }
    }
}