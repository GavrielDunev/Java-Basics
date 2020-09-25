import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = 1;
        double sum = 0;
        int fails = 0;

        while (n <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                fails++;
                if (fails > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, n);
                    break;
                }
                continue;
            }
            sum = sum + grade;
            n++;
        }
        if (fails <= 1) {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}