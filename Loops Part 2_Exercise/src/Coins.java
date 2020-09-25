import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double change = Math.round(changeInLeva * 100);
        int coins = 0;

        while (change != 0){
            if (change >= 200){
                change = change - 200;
                coins++;
            }else if (change >= 100){
                change = change - 100;
                coins++;
            }else if (change >= 50){
                change = change - 50;
                coins++;
            }else if (change >= 20){
                change = change - 20;
                coins++;
            }else if (change >= 10){
                change = change - 10;
                coins++;
            }else if (change >= 5){
                change = change - 5;
                coins++;
            }else if (change >= 2){
                change = change - 2;
                coins++;
            }else if (change >= 1){
                change = change - 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
