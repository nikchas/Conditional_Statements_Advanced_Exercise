package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int amountOfNights = Integer.parseInt(scanner.nextLine());

        double pricePerNightInApartment;
        double pricePerNightInStudio;
        double priceApartment = 0;
        double priceStudio = 0;

        switch (month){
            case "May":
            case "October":

                pricePerNightInApartment = 65.00;
                pricePerNightInStudio = 50.00;

                priceApartment = pricePerNightInApartment * amountOfNights;
                priceStudio = pricePerNightInStudio * amountOfNights;

                if(amountOfNights > 7 && amountOfNights <= 14){

                priceStudio = priceStudio - 0.05*priceStudio;

                }

                if(amountOfNights > 14){

                priceApartment=priceApartment-0.10*priceApartment;
                priceStudio = priceStudio - 0.30*priceStudio;

                }
                break;

            case "June":
            case "September":

                pricePerNightInApartment = 68.70;
                pricePerNightInStudio = 75.20;

                priceApartment = pricePerNightInApartment * amountOfNights;
                priceStudio = pricePerNightInStudio * amountOfNights;


                if(amountOfNights > 14){

                    priceApartment = priceApartment-0.10*priceApartment;
                    priceStudio = priceStudio - 0.20*priceStudio;

                }
                break;

            case "July":
            case "August":

                pricePerNightInApartment = 77.00;
                pricePerNightInStudio = 76.00;

                priceApartment = pricePerNightInApartment * amountOfNights;
                priceStudio = pricePerNightInStudio * amountOfNights;

                if(amountOfNights > 14){

                    priceApartment = priceApartment-0.10*priceApartment;

                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.\n", priceApartment);

        System.out.printf("Studio: %.2f lv.\n", priceStudio);
    }
}