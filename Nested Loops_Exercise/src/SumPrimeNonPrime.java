import java.io.OutputStream;
import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number >= 0) {
                boolean isPrime = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sumPrimeNumbers += number;
                } else {
                    sumNonPrimeNumbers += number;
                }
            } else {
                System.out.println("Number is negative.");
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);
    }
}
