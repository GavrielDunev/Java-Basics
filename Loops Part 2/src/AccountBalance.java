import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        double sum = 0;
        while (i <= n) {
            double money = Double.parseDouble(scanner.nextLine());
            if (money < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", money);
            sum += money;
            i++;
        }
        System.out.printf("Total: %.2f",sum);
    }
}
