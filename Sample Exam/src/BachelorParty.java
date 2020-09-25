import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = Integer.parseInt(scanner.nextLine());
        int numberGuests = 0;
        int sum = 0;
        String peopleInOneGroup = scanner.nextLine();
        while(true){
            if (peopleInOneGroup.equals("The restaurant is full")){
                break;
            }
            int guests = Integer.parseInt(peopleInOneGroup);
            if (guests < 5){
                sum = sum + guests * 100;
            }else{
                sum = sum + guests * 70;
            }
            numberGuests = numberGuests + guests;
            peopleInOneGroup = scanner.nextLine();
        }
        if (sum >= singer){
            int moneyLeft = sum - singer;
            System.out.printf("You have %d guests and %d leva left.", numberGuests, moneyLeft);
        }else{
            System.out.printf("You have %d guests and %d leva income, but no singer.",numberGuests, sum);
        }
    }
}