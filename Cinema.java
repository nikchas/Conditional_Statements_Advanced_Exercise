package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int collums = Integer.parseInt(scanner.nextLine());
        int allPlaces = rows*collums;
        double income = 0;

        switch (projection) {
            case "Premiere":
                    income = allPlaces * 12.00;
                break;
            case "Normal":
                    income = allPlaces * 7.50;
                break;
            case "Discount":
                    income = allPlaces * 5.00;
                break;
        }

        System.out.printf("%.2f leva", income);

    }
}
