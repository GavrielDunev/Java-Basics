import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String volume = scanner.nextLine();
        int counter = 0;
        while (!volume.equals("End")){
            double volumeOfCase = Double.parseDouble(volume);
                counter++;
            if (counter % 3 == 0){
                volumeOfCase = volumeOfCase + 0.1 * volumeOfCase;
            }
            capacity -= volumeOfCase;
            if (capacity <= 0){
                System.out.printf("No more space!%n");
                counter--;
                break;
            }
            volume = scanner.nextLine();
        }
        if(capacity > 0) {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}