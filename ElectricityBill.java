import java.io.*;
import java.util.*;

class ElectricityBill {
    
    double previousMonthReading;
    double currentMonthReading;
    String domesticConsumer;

    ElectricityBill(double previousMonthReading, double currentMonthReading, String domesticConsumer) {
        
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.domesticConsumer = domesticConsumer;
    }

    public double calculateBill() {
        double unitsConsumed = currentMonthReading - previousMonthReading;
        double amount = 0.0;
        
        if (domesticConsumer.equals("yes")){

            amount = unitsConsumed * 4.50;
        }
        else{

            if (unitsConsumed <= 400) {
                amount = unitsConsumed * 3;
            } 
            else if (unitsConsumed <= 500) {
                amount = (400*3) + ((unitsConsumed-400) * 6.5);
            } 
            else if (unitsConsumed <= 600) {
                amount =(400*3)+(500*6.5)+ ((unitsConsumed-500) * 8);
            } 
            else if (unitsConsumed <= 800) {
                amount =(400*3)+(500*6.5)+(600*8)+ ((unitsConsumed-600) * 9);
            } 
            else if (unitsConsumed <= 1000) {
                amount =(400*3)+(500*6.5)+(600*8)+(800*9)+ ((unitsConsumed-800) * 10);
            } 
            else {
                amount =(400*3)+(500*6.5)+(600*8)+(800*9)+(1000*10) + ((unitsConsumed-1000) * 11);
            }
        }
        return amount;
    }
}

class mainFunc{
    public static void main(String[] args)throws IOException {

        double consumerno, previousMonthReading, currentMonthReading;
        String consumerName, domesticConsumer;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the consumerno: ");
        consumerno = sc.nextDouble();
        
        System.out.print("Enter the consumername: ");
        consumerName = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter the previousMonthReading: ");
        previousMonthReading = sc.nextDouble();

        System.out.print("Enter the currentMonthReading: ");
        currentMonthReading = sc.nextDouble();

        System.out.print("Are you Domestic Consumer? (yes/no): ");
        domesticConsumer = sc.nextLine();
        domesticConsumer.toLowerCase();
        sc.nextLine();

        ElectricityBill bill = new ElectricityBill(previousMonthReading, currentMonthReading, domesticConsumer);
        System.out.println("The electricity bill for "+ (currentMonthReading-previousMonthReading) +" is: Rs " + bill.calculateBill());
    }
}
