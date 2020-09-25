import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int numberHolidays = Integer.parseInt(scanner.nextLine());
        int numberWeekends = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - numberWeekends;
        double saturdaysInSofia = weekendsInSofia * 3.0 / 4;
        double playsInSofiaInHolidays = numberHolidays * 2.0 / 3;
        double totalPlays = saturdaysInSofia + numberWeekends + playsInSofiaInHolidays;

        if (year.equals("leap")) {
            double additionalPlays = totalPlays * 0.15;
            double sum = totalPlays + additionalPlays;
            System.out.printf("%.0f", Math.floor(sum));
        }else {
            System.out.printf("%.0f", Math.floor(totalPlays));
        }
    }
}
