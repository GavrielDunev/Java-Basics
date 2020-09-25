import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeSushi = scanner.nextLine();
        String restaurant = scanner.nextLine();
        int numberPortions = Integer.parseInt(scanner.nextLine());
        char delivery = scanner.nextLine().charAt(0);
        double price = 0;
        boolean isInvalid = false;
        switch (typeSushi) {
            case "sashimi":
                if (restaurant.equals("Sushi Zone")) {
                    price = numberPortions * 4.99;
                } else if (restaurant.equals("Sushi Time")) {
                    price = numberPortions * 5.49;
                } else if (restaurant.equals("Sushi Bar")) {
                    price = numberPortions * 5.25;
                } else if (restaurant.equals("Asian Pub")) {
                    price = numberPortions * 4.50;
                } else {
                    System.out.printf("%s is invalid restaurant!", restaurant);
                    isInvalid = true;
                }
                break;
            case "maki":
                if (restaurant.equals("Sushi Zone")) {
                    price = numberPortions * 5.29;
                } else if (restaurant.equals("Sushi Time")) {
                    price = numberPortions * 4.69;
                } else if (restaurant.equals("Sushi Bar")) {
                    price = numberPortions * 5.55;
                } else if (restaurant.equals("Asian Pub")) {
                    price = numberPortions * 4.80;
                } else {
                    System.out.printf("%s is invalid restaurant!", restaurant);
                    isInvalid = true;
                }
                break;
            case "uramaki":
                if (restaurant.equals("Sushi Zone")) {
                    price = numberPortions * 5.99;
                } else if (restaurant.equals("Sushi Time")) {
                    price = numberPortions * 4.49;
                } else if (restaurant.equals("Sushi Bar")) {
                    price = numberPortions * 6.25;
                } else if (restaurant.equals("Asian Pub")) {
                    price = numberPortions * 5.50;
                } else {
                    System.out.printf("%s is invalid restaurant!", restaurant);
                    isInvalid = true;
                }
                break;
            case "temaki":
                if (restaurant.equals("Sushi Zone")) {
                    price = numberPortions * 4.29;
                } else if (restaurant.equals("Sushi Time")) {
                    price = numberPortions * 5.19;
                } else if (restaurant.equals("Sushi Bar")) {
                    price = numberPortions * 4.75;
                } else if (restaurant.equals("Asian Pub")) {
                    price = numberPortions * 5.50;
                } else {
                    System.out.printf("%s is invalid restaurant!", restaurant);
                    isInvalid = true;
                }
                break;
        }
        if (delivery == 'Y') {
            price = price + 0.2 * price;
        }
        if (!isInvalid) {
            System.out.printf("Total price: %.0f lv.", Math.ceil(price));
        }
    }
}