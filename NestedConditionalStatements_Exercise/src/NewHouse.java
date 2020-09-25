import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (typeFlower.equals("Roses")) {
            price = numberFlowers * 5;
        }else if (typeFlower.equals("Dahlias")){
            price = numberFlowers * 3.80;
        }else if (typeFlower.equals("Tulips")){
            price = numberFlowers * 2.80;
        }else if (typeFlower.equals("Narcissus")){
            price = numberFlowers * 3;
        }else if (typeFlower.equals("Gladiolus")){
            price = numberFlowers * 2.50;
        }

        if (typeFlower.equals("Roses") && numberFlowers > 80){
            price = price * 0.9;
        }else if (typeFlower.equals("Dahlias") && numberFlowers > 90) {
            price = price * 0.85;
        }else if (typeFlower.equals("Tulips") && numberFlowers > 80){
            price = price * 0.85;
        }else if (typeFlower.equals("Narcissus") && numberFlowers < 120){
            price = price * 1.15;
        }else if (typeFlower.equals("Gladiolus") && numberFlowers < 80){
            price = price * 1.2;
        }

        if (budget < price) {
            double neededMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }else {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, typeFlower, leftMoney);
        }
    }
}
