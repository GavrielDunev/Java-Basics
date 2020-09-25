import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = 1;
        double sum = 0;
        while (n <= 12){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                continue;
            }
            sum = sum + grade;
            n++;
        }

        double averageGrade = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
    }
}
