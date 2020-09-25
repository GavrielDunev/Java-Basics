import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberOfSets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (fruit){
            case "Watermelon":
                if (size.equals("small")){
                    price = 56 * 2;
                }else{
                    price = 28.70 * 5;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price = 36.66 * 2;
                }else{
                    price = 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price = 42.10 * 2;
                }else{
                    price = 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price = 20 * 2;
                }else{
                    price = 15.20 * 5;
                }
                break;
        }
        double sum = price * numberOfSets;
        if (sum >= 400 && sum <= 1000){
            sum = sum - 0.15 * sum;
        }else if (sum > 1000){
            sum = sum - 0.5 * sum;
        }
        System.out.printf("%.2f lv.",sum);
    }
}
