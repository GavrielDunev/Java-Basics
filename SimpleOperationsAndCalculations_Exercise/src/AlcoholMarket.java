import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - (0.40 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.80 * rakiaPrice);
        double rakiaSum = rakiaPrice * rakiaQuantity;
        double wineSum = winePrice * wineQuantity;
        double beerSum = beerPrice * beerQuantity;
        double whiskeySum = whiskeyPrice * whiskeyQuantity;
        double finalSum = rakiaSum + beerSum + whiskeySum + wineSum;
        System.out.printf("%.2f", finalSum);
    }
}