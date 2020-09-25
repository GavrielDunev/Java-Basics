import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeightOfAstronauts = Double.parseDouble(scanner.nextLine());

        double volumeOfSpaceShip = width * length * height;
        double volumeOfOneRoom = (averageHeightOfAstronauts + 0.40) * 2 * 2;
        double numberAstronauts = Math.floor(volumeOfSpaceShip / volumeOfOneRoom);
        if (numberAstronauts >= 3 && numberAstronauts <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", numberAstronauts);
        }else if (numberAstronauts > 10){
            System.out.println("The spacecraft is too big.");
        }else {
            System.out.println("The spacecraft is too small.");
        }
    }
}
