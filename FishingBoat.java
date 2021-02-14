package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double rentPrice = 0;

        switch (season){
            case "Spring":
                rentPrice = 3000;
                break;

            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;

            case "Winter":
                rentPrice = 2600;
                break;
        }

        if(fishers <= 6){
            rentPrice = rentPrice - 0.10*rentPrice;
        }
        else if(fishers <=11){
            rentPrice = rentPrice - 0.15*rentPrice;
        }
        else{
            rentPrice = rentPrice - 0.25*rentPrice;
        }

        if (fishers % 2 == 0 && !season.equals("Autumn")){
            rentPrice = rentPrice - 0.05*rentPrice;
        }

        if(budget >= rentPrice){
            System.out.printf("Yes! You have %.2f leva left.", budget-rentPrice);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva.", rentPrice - budget);
        }

    }
}
