package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerRose = 5.00;
        double pricePerDahlia = 3.80;
        double pricePerTulip = 2.80;
        double prisePerNarcissus = 3.00;
        double pricePerGladiolus = 2.50;

        String choice = scanner.nextLine();
        int amountOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double budgetDiff;
        if (choice.equals("Roses")) {
            budgetDiff = budget - (amountOfFlowers*pricePerRose);
            if (budget >= amountOfFlowers*pricePerRose){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, choice, budgetDiff);
            }
            else {
                System.out.printf("Not enough money, you need %.2f leva more.", -1*budgetDiff);
            }
        }
        if (choice.equals("Dahlias")) {
            budgetDiff = budget - amountOfFlowers*pricePerDahlia;
            if (budget >= amountOfFlowers*pricePerDahlia){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, choice, budgetDiff);
            }
            else {
                System.out.printf("Not enough money, you need %.2f leva more.", -1*budgetDiff);
            }
        }
        if (choice.equals("Tulips")) {
            budgetDiff = budget - amountOfFlowers*pricePerTulip;
            if (budget >= amountOfFlowers*pricePerTulip){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, choice, budgetDiff);
            }
            else {
                System.out.printf("Not enough money, you need %.2f leva more.", -1*budgetDiff);
            }
        }

    }
}
