import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        int totalDog = 0;
        int totalCat = 0;
        int totalFood = 0;
        double bonus = 0;
        for (int i = 1; i<= days; i++){
            int foodDog = Integer.parseInt(scanner.nextLine());
            totalDog += foodDog;
            int foodCat = Integer.parseInt(scanner.nextLine());
            totalCat += foodCat;
            totalFood += foodCat + foodDog;
            if (i % 3 == 0){
                bonus += (foodCat + foodDog) * 0.1;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", bonus);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDog * 1.0 / totalFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", totalCat * 1.0 / totalFood * 100);
    }
}
