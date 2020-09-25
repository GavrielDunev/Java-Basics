import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0.35 * minSalary;
        double successScholarship = averageSuccess * 25;

        if (income > minSalary && averageSuccess < 5.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (income < minSalary && averageSuccess < 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if ((income < minSalary) && (averageSuccess >= 4.50) && (averageSuccess < 5.50)) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        } else if ((income < minSalary) && (averageSuccess >= 4.50) && (socialScholarship > successScholarship)) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }else if ((income < minSalary) && (averageSuccess >= 5.50) && (successScholarship > socialScholarship)) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarship));
        }else if ((income >= minSalary) && (averageSuccess >= 5.50 )) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarship));
        }
    }
}