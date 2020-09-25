import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBadMarks = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int badMarks = 0;
        int numberProblems = 0;
        int goodMarks = 0;
        String lastProblem = text;
        while (!text.equals("Enough")) {
            lastProblem = text;
            numberProblems++;
            int mark = Integer.parseInt(scanner.nextLine());
            if (mark <= 4) {
                badMarks++;
            }
            if (badMarks >= maxBadMarks) {
                System.out.printf("You need a break, %d poor grades.", badMarks);
                break;
            }
            goodMarks = goodMarks + mark;
            text = scanner.nextLine();
        }
        if (text.equals("Enough")) {
            double averageScore = goodMarks * 1.0 / numberProblems;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", numberProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
