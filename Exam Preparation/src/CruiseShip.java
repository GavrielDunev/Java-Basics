import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCruise = scanner.nextLine();
        String typeCabin = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (typeCruise) {
            case "Mediterranean":
                if (typeCabin.equals("standard cabin")) {
                    price = 27.50;
                } else if (typeCabin.equals("cabin with balcony")) {
                    price = 30.20;
                } else {
                    price = 40.50;
                }
                break;
            case "Adriatic":
                if (typeCabin.equals("standard cabin")) {
                    price = 22.99;
                } else if (typeCabin.equals("cabin with balcony")) {
                    price = 25.00;
                } else {
                    price = 34.99;
                }
                break;
            case "Aegean":
                if (typeCabin.equals("standard cabin")) {
                    price = 23.00;
                } else if (typeCabin.equals("cabin with balcony")) {
                    price = 26.60;
                } else {
                    price = 39.80;
                }
                break;
        }
        price = price * nights * 4;
        if (nights > 7){
            price = price - 0.25 * price;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", typeCruise, price);
    }
}
