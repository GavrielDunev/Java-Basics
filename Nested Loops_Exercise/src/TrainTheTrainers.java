import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberJury = Integer.parseInt(scanner.nextLine());
        double sumAllGrades = 0;
        int numberOfGrades = 0;
        while(true){
            String presentation = scanner.nextLine();
            double sumGradesForOnePresentation = 0;
            if (presentation.equals("Finish")){
                break;
            }

            for (int i = 0; i < numberJury; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                sumGradesForOnePresentation += grade;
                numberOfGrades++;
            }
            System.out.printf("%s - %.2f.%n", presentation, sumGradesForOnePresentation / numberJury);
            sumAllGrades += sumGradesForOnePresentation;
        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / numberOfGrades);
    }
}