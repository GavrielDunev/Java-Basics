import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthHall = Double.parseDouble(scanner.nextLine());
        double widthHall = Double.parseDouble(scanner.nextLine());
        double sideWardrobe = Double.parseDouble(scanner.nextLine());

        double sizeHallCm = (lengthHall * 100) * (widthHall * 100);
        double sizeWardrobe = (sideWardrobe * 100) * (sideWardrobe * 100);
        double sizeBench = sizeHallCm / 10;
        double freeSpace = sizeHallCm - sizeWardrobe - sizeBench;
        double dancers = freeSpace / 7040;
        System.out.printf("%.0f", Math.floor(dancers));
    }
}
