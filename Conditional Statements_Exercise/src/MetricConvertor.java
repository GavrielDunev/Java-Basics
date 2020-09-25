import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        double mToCm = number * 100;
        double mToMm= number * 1000;
        double cmToM = number / 100;
        double mmToM = number / 1000;
        double cmToMm = number * 10;
        double mmToCm = number / 10;
        if (inputUnit.equals("m")) {
            if (outputUnit.equals("cm")) {
                System.out.printf("%.3f", mToCm);
            }else if (outputUnit.equals("mm")) {
                System.out.printf("%.3f", mToMm);
            }
        }else if (inputUnit.equals("cm")) {
            if (outputUnit.equals("m")) {
                System.out.printf("%.3f", cmToM);
            } else if (outputUnit.equals("mm")) {
                System.out.printf("%.3f", cmToMm);
            }
        } else if (inputUnit.equals("mm")) {
            if (outputUnit.equals("m")) {
                System.out.printf("%.3f", mmToM);
            } else if (outputUnit.equals("cm")) {
                System.out.printf("%.3f", mmToCm);
            }
        }
    }
}
