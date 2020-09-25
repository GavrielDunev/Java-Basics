import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double distanceToSwim = timeForOneMeter * distanceInMeters;
        double delay = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTime = distanceToSwim + delay;

        if (worldRecord <= totalTime) {
            double neededTime = totalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
