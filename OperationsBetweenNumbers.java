package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1  = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if(operator.equals("+")){
            int N = N1 + N2;
            if(N % 2 == 0) {
                System.out.printf("%d + %d = %d - even", N1, N2, N);
            }
            if(N % 2 != 0){
                System.out.printf("%d + %d = %d - odd", N1, N2, N);
            }
        }

        else if(operator.equals("-")){
            int N = N1 - N2;
            if(N % 2 == 0) {
                System.out.printf("%d - %d = %d - even", N1, N2, N);
            }
            else if(N % 2 != 0){
                System.out.printf("%d - %d = %d - odd", N1, N2, N);
            }
        }

        else if(operator.equals("*")){
            int N = N1 * N2;
            if(N % 2 == 0) {
                System.out.printf("%d * %d = %d - even", N1, N2, N);
            }
            else if(N % 2 != 0){
                System.out.printf("%d * %d = %d - odd", N1, N2, N);
            }
        }

        else if(operator.equals("/")) {
            if (N1 == 0) {
                System.out.printf("Cannot divide %d by zero", N2);
            }
            else if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double N = (double) N1 / (double) N2;
                System.out.printf("%d / %d = %.2f", N1, N2, N);
            }
        }

        else if(operator.equals("%")){
            if(N1 == 0){
                System.out.printf("Cannot divide %d by zero", N2);
            }
            else if(N2 == 0){
                System.out.printf("Cannot divide %d by zero", N1);
            }
            else {
                double N = (double) N1 % (double) N2;
                System.out.printf("%d %% %d = %.0f", N1, N2, N);
            }
        }
    }
}
