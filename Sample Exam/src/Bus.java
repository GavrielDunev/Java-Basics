import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPassengers = Integer.parseInt(scanner.nextLine());
        int numberStations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberStations; i++){
            int passengersOut = Integer.parseInt(scanner.nextLine());
            numberPassengers -= passengersOut;
            int passengersIn = Integer.parseInt(scanner.nextLine());
            numberPassengers += passengersIn;
            if (i % 2 != 0){
                numberPassengers += 2;
            }else {
                numberPassengers -= 2;
            }
        }
        System.out.printf("The final number of passengers is : %d", numberPassengers);
    }
}
