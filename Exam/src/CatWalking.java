import java.io.OutputStream;
import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int total = minutesWalk * walks * 5;
        double neededCalories = 0.5 * calories;
        if (total >= neededCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", total);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", total);
        }
    }
}
