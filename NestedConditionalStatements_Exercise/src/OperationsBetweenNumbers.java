import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int sum = 0;
        if (operator == '+') {
            sum = number1 + number2;
            if (sum % 2 == 0) {
                System.out.printf("%d + %d = %d - even", number1, number2, sum);
            } else {
                System.out.printf("%d + %d = %d - odd", number1, number2, sum);
            }
        } else if (operator == '-') {
            sum = number1 - number2;
            if (sum % 2 == 0) {
                System.out.printf("%d - %d = %d - even", number1, number2, sum);
            } else {
                System.out.printf("%d - %d = %d - odd", number1, number2, sum);
            }
        } else if (operator == '*') {
            sum = number1 * number2;
            if (sum % 2 == 0) {
                System.out.printf("%d * %d = %d - even", number1, number2, sum);
            } else {
                System.out.printf("%d * %d = %d - odd", number1, number2, sum);
            }
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.printf("Cannot divide %d by zero", number1);
            } else {
                double division = number1 * 1.0 / number2;
                System.out.printf("%d / %d = %.2f", number1, number2, division);
            }
        } else if (operator == '%') {
            if (number2 == 0) {
                System.out.printf("Cannot divide %d by zero", number1);
            } else {
                sum = number1 % number2;
                System.out.printf("%d %% %d = %d", number1, number2, sum);
            }
        }
    }
}
