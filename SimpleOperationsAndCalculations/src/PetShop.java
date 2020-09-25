import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double dogFood = dogs * 2.50;
        int animalFood = animals * 4;
        double food = dogFood + animalFood;
        System.out.printf("%.2f lv.", food);

    }
}
