import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        int nightsToStay = daysToStay - 1;
        double roomForOnePerson = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;
        double price = 0;

        switch (typeRoom) {
            case "room for one person":
                price = nightsToStay * roomForOnePerson;
                break;
            case "apartment":
                if (nightsToStay < 10) {
                    price = nightsToStay * apartment * 0.7;
                } else if (nightsToStay >= 10 && nightsToStay <= 15) {
                    price = nightsToStay * apartment * 0.65;
                } else {
                    price = nightsToStay * apartment * 0.5;
                }
                break;
            case "president apartment":
                if (nightsToStay < 10) {
                    price = nightsToStay * presidentApartment * 0.9;
                } else if (nightsToStay >= 10 && nightsToStay <= 15) {
                    price = nightsToStay * presidentApartment * 0.85;
                } else {
                    price = nightsToStay * presidentApartment * 0.8;
                }
                break;
        }
        switch (rating) {
            case "positive":
                price = price + 0.25 * price;
                break;
            case "negative":
                price = price - 0.1 * price;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
