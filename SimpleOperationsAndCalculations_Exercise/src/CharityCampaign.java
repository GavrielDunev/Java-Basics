import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakesDay = cakes * 45;
        double wafflesDay = waffles * 5.80;
        double pancakesDay = pancakes * 3.20;
        double sumDay = (cakesDay + wafflesDay + pancakesDay) * confectioners;
        double sumCampaign = sumDay * days;
        double sumFinal = sumCampaign - ((1.0 / 8.0) * sumCampaign);
        System.out.printf("%.2f", sumFinal);
    }
}