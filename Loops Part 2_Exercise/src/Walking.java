import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countSteps = 0;

        while (!input.equals("Going home")) {
            countSteps = countSteps + Integer.parseInt(input);
            if (countSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int stepsGoingHome = Integer.parseInt(scanner.nextLine());
            countSteps = countSteps + stepsGoingHome;
            if (countSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
            } else {
                int leftSteps = 10000 - countSteps;
                System.out.printf("%d more steps to reach goal.", leftSteps);
            }
        }
    }
}
