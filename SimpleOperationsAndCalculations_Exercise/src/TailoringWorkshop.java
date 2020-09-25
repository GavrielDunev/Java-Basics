import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double lengthTables = Double.parseDouble(scanner.nextLine());
        double widthTables = Double.parseDouble(scanner.nextLine());

        double rectangleArea = tables * (lengthTables + 2 * 0.30) * (widthTables + 2 * 0.30);
        double squareArea = tables * (lengthTables / 2) * (lengthTables / 2);
        double priceUsd = rectangleArea * 7 + squareArea * 9;
        double priceBgn = priceUsd * 1.85;
        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);
    }
}
