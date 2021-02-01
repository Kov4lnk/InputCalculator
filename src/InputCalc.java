import java.util.Scanner;

public class InputCalc {
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int counter = 0;

        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter ));
                break;
            }

        }
        scanner.nextLine();
        scanner.close();
    }
}
