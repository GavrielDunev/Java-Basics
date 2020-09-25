import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHour = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        int hourToMinutes = inputHour * 60;
        int sumMinutes = hourToMinutes + inputMinutes + 15;
        int hour = sumMinutes / 60;
        int minutes = sumMinutes % 60;

        if (hour == 24) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
