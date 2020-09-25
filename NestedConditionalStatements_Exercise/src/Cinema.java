import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type) {
            case "Premiere":
                price = 12.00 * row * column;
                break;
            case "Normal":
                price = 7.50 * row * column;
                break;
            case "Discount":
                price = 5.00 * row * column;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
