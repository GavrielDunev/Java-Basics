import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            int difference = Math.abs(max - sum);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
