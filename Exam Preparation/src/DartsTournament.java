import java.util.Scanner;

public class DartsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int moves = 0;
        int difference = 0;
        while (startingPoints != 0) {
            String sector = scanner.nextLine();
            if (sector.equals("bullseye")) {
                moves++;
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moves);
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());
            switch (sector) {
                case "number section":
                    startingPoints = startingPoints - points;
                    moves++;
                    break;
                case "double ring":
                    startingPoints = startingPoints - points * 2;
                    moves++;
                    break;
                case "triple ring":
                    startingPoints = startingPoints - points * 3;
                    moves++;
                    break;
            }
            if(startingPoints < 0){
                System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startingPoints));
                break;
            }
        }
        if (startingPoints == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", moves);
        }
    }
}