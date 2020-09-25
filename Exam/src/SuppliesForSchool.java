import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double litersCleaner = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleaner = litersCleaner * 1.20;
        double totalPrice = priceCleaner + priceMarkers + pricePens;
        double totalPriceWithDiscount = totalPrice - (discount * 1.0 / 100) * totalPrice;
        System.out.printf("%.3f",totalPriceWithDiscount);
    }
}
