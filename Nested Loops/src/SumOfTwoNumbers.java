import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginningOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = beginningOfInterval; i <= endOfInterval; i++) {
            for (int j = beginningOfInterval; j <= endOfInterval; j++) {
                counter++;
                if (i + j == m) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, m);
                    isFound = true;
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if(!isFound){
            System.out.printf("%d combinations - neither equals %d", counter, m);
        }
    }
}