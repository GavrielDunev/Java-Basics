import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int fifth = 0;

        for (int i = 0; i < number; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 200) {
                first++;
            } else if (n <= 399) {
                second++;
            } else if (n <= 599) {
                third++;
            } else if (n <= 799) {
                fourth++;
            } else {
                fifth++;
            }
        }
        double p1 = first * 1.0/ number * 100;
        double p2 = second * 1.0 / number * 100;
        double p3 = third * 1.0 / number * 100;
        double p4 = fourth * 1.0 / number * 100;
        double p5 = fifth * 1.0 / number * 100;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%\n", p5);
    }
}
