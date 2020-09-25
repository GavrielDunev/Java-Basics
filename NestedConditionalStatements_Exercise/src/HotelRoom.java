import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());

        double priceForStudio = 0;
        double priceForApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceForStudio = 50 * numberNights;
            priceForApartment = 65 * numberNights;
        } else if (month.equals("June") || month.equals("September")) {
            priceForStudio = 75.20 * numberNights;
            priceForApartment = 68.70 * numberNights;
        } else {
            priceForStudio = 76 * numberNights;
            priceForApartment = 77 * numberNights;
        }

        if (numberNights > 7 && numberNights <= 14){
            if (month.equals("May") || month.equals("October")) {
                priceForStudio *= 0.95;
            }
        }else if (numberNights > 14){
            if (month.equals("May") || month.equals("October")) {
                priceForStudio *= 0.7;
                priceForApartment *= 0.9;
            }else if (month.equals("June") || month.equals("September")) {
                priceForStudio *= 0.8;
                priceForApartment *= 0.9;
            }else {
                priceForApartment *= 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);
    }
}