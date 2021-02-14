package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double expenses = 0;
        String destination = "";
        String accomodation = "";

        if(budget<=100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    expenses = budget * 0.30;
                    accomodation = "Camp";
                    break;
                case "winter":
                    expenses = budget * 0.70;
                    accomodation = "Hotel";
                    break;
            }
        }
        else if(budget<=1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    expenses = budget * 0.40;
                    accomodation = "Camp";
                    break;
                case "winter":
                    accomodation = "Hotel";
                    expenses = budget * 0.80;
                    break;
            }
        }
        else if(budget > 1000){
            destination = "Europe";
            accomodation = "Hotel";
            expenses = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", accomodation, expenses);
    }
}
