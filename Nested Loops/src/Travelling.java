import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double minBudget = Double.parseDouble(scanner.nextLine());
            while (minBudget > 0){
                double deposit = Double.parseDouble(scanner.nextLine());
                minBudget = minBudget - deposit;
            }
            System.out.printf("Going to %s!%n", destination);
           destination = scanner.nextLine();
            }
        }
    }