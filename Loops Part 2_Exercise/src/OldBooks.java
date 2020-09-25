import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        String currentBook = scanner.nextLine();
        int checkedBooks = 0;

        while (checkedBooks <= capacity) {
            if (!currentBook.equals(wantedBook)) {
                checkedBooks++;
            } else {
                System.out.printf("You checked %d books and found it.", checkedBooks);
                break;
            }
            if (checkedBooks == capacity) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", checkedBooks);
                break;
            }
            currentBook = scanner.nextLine();
        }
    }
}