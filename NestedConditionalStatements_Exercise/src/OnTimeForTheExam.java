import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());

        int hourOfExamInMinutes = hourOfExam * 60;
        int hourOfArrivalInMinutes = hourOfArrival * 60;
        int sumExam = hourOfExamInMinutes + minuteOfExam;
        int sumArrival = hourOfArrivalInMinutes + minuteOfArrival;

        if (sumArrival > sumExam){
            System.out.println("Late");
        }else if (sumArrival == sumExam || sumArrival >= sumExam - 30) {
            System.out.println("On time");
        }else if (sumArrival < sumExam - 30){
            System.out.println("Early");
        }

        if (sumArrival < sumExam && sumArrival > sumExam - 60){
            int early = sumExam - sumArrival;
            System.out.printf("%d minutes before the start", early);
        }else if (sumArrival < sumExam && sumArrival <= sumExam - 60){
            int early = sumExam - sumArrival;
            int hourEarly = early / 60;
            int minuteEarly = early % 60;
            System.out.printf("%d:%02d hours before the start", hourEarly, minuteEarly);
        } else if (sumArrival > sumExam && sumArrival < sumExam + 60) {
            int delay = sumArrival - sumExam;
            System.out.printf("%d minutes after the start", delay);
        }else if (sumArrival > sumExam && sumArrival >= sumExam + 60) {
            int delay = sumArrival - sumExam;
            int hourDelay = delay / 60;
            int minuteDelay = delay % 60;
            System.out.printf("%d:%02d hours after the start", hourDelay, minuteDelay);
        }
    }
}