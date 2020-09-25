import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodPriceForOneDay = Double.parseDouble(scanner.nextLine());
        double SouvenirsPriceForOneDay = Double.parseDouble(scanner.nextLine());
        double hotelPriceForOneDay = Double.parseDouble(scanner.nextLine());

        double litresGasolineNeeded = 420 * 1.0 / 100 * 7;
        double PriceForGasoline = litresGasolineNeeded * 1.85;
        double PriceForFoodAndSouvenirs = 3 * foodPriceForOneDay + 3 * SouvenirsPriceForOneDay;

        double firstDayInHotel = hotelPriceForOneDay * 0.9;
        double secondDayInHotel = hotelPriceForOneDay * 0.85;
        double thirdDayInHotel = hotelPriceForOneDay * 0.8;
        double totalPrice = thirdDayInHotel + secondDayInHotel + firstDayInHotel + PriceForFoodAndSouvenirs + PriceForGasoline;
        System.out.printf("Money needed: %.2f", totalPrice);

    }
}
