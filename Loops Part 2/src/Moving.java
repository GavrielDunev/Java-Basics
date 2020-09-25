import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * length * height;
        String input = scanner.nextLine();
        int numberCartons = 0;
        while (!input.equals("Done")) {
            numberCartons = numberCartons + Integer.parseInt(input);
            if (freeSpace < numberCartons){
                int neededCubicMeters = numberCartons - freeSpace;
                System.out.printf("No more free space! You need %d Cubic meters more.", neededCubicMeters);
                break;
            }
            input = scanner.nextLine();
        }
        if (freeSpace >= numberCartons){
            int leftCubicMeters = freeSpace - numberCartons;
            System.out.printf("%d Cubic meters left.", leftCubicMeters);
        }
    }
}
