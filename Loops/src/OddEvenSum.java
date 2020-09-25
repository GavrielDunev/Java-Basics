import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even = even + number;
            } else {
                odd = odd + number;
            }
        }
            if (odd == even) {
                System.out.println("Yes");
                System.out.printf("Sum = %d", odd);
            } else {
                System.out.println("No");
                int difference = Math.abs(odd - even);
                System.out.printf("Diff = %d", difference);
            }
        }
    }
