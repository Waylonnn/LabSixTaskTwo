import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tankk;
        String mpgg;
        String ppgg;
        double tank = -1;
        double mpg = -1;
        double ppg = -1;
        do{
            System.out.println("Enter current Number of Gallons of Gasoline in Vehicle: ");
            tankk = scan.nextLine();
            if(tankk.matches("[0-9]+")){
                tank = Double.parseDouble(tankk);
            } else{
                System.out.println("You have entered an invalid value for gallons of gas. Please try again.");
            }

        } while(tank < 0);

        do{
            System.out.println("Enter Fuel Effeciency in MPG: ");
            mpgg = scan.nextLine();
            if(mpgg.matches("\\d+")){
                mpg = Double.parseDouble(mpgg);
            } else{
                System.out.println("You have entered an invalid value for fuel effeciency. Please try again.");
            }
        } while(mpg <= 0);

        do{
            System.out.println("Enter Current Price for Gallon of Gas: ");
            ppgg = scan.nextLine();
            if(ppgg.matches("\\d+(\\.\\d+)?")){
                ppg = Double.parseDouble(ppgg);
            } else{
                System.out.println("You have entered an invalid value for the price per gallon of gas. Please try again.");
            }
        } while(ppg <= 0);
        System.out.println("Cost per 100 miles in $:\t" + (100/32) * ppg);
        System.out.println("Distance Left in Miles:\t" + mpg * tank);
    }
}