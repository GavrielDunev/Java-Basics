import java.util.Scanner;

public class CruiseGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int volleyball = 0;
        int badminton = 0;
        int tennis = 0;
        double pointsVolleyball = 0;
        double pointsTennis = 0;
        double pointsBadminton = 0;
        for (int i = 1; i <= games; i++) {
            String nameOfGame = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());
            if (nameOfGame.equals("volleyball")) {
                volleyball++;
                pointsVolleyball = pointsVolleyball + points + 0.07 * points;
            } else if (nameOfGame.equals("tennis")) {
                tennis++;
                pointsTennis = pointsTennis + points + 0.05 * points;
            } else {
                badminton++;
                pointsBadminton = pointsBadminton + points + 0.02 * points;
            }
        }
        double averageVolleyball = Math.floor(pointsVolleyball / volleyball);
        double averageTennis = Math.floor(pointsTennis / tennis);
        double averageBadminton = Math.floor(pointsBadminton / badminton);
        double totalPoints = Math.floor(pointsBadminton + pointsVolleyball + pointsTennis);
        if (averageBadminton >= 75 && averageVolleyball >= 75 && averageTennis >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, totalPoints);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.",name, totalPoints);
        }
        }
    }
