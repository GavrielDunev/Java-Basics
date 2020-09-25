import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film;
        int totalTickets = 0;
        int student = 0;
        int standard = 0;
        int kids = 0;

        while (!(film = scanner.nextLine()).equals("Finish")) {

            int freePlaces = Integer.parseInt(scanner.nextLine());

            int fullPlaces = 0;

            for (int i = 0; i < freePlaces; i++) {
                String typeOfTicket = scanner.nextLine();

                switch (typeOfTicket) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }

                if (fullPlaces >= freePlaces || typeOfTicket.equals("End")) {
                    break;
                }
                fullPlaces++;
                totalTickets++;
            }
            double percent = fullPlaces * 1.0 / freePlaces * 100;
            System.out.printf("%s - %.2f%% full.%n", film, percent);
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        double percentStudents = student * 1.0 / totalTickets * 100;
        double percentStandard = standard * 1.0 / totalTickets * 100;
        double percentKids = kids * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudents);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.", percentKids);
    }
}