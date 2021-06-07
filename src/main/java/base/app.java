package base;
import java.util.*;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String conversion = newScan.nextLine();

        int temp = 0;
        if(conversion.equals("C") || conversion.equals("c"))
            System.out.print("Please enter you temperature in Fahrenheit: ");
        else
            System.out.print("Please enter you temperature in Celsius: ");

        temp = newScan.nextInt();

        //Calculations
        int temp2 = 0;
        if(conversion.equals("C") || conversion.equals("c")) {
            temp2 = (temp - 32) * 5 / 9;
            System.out.println("Your temperature in Fahrenheit is: " +temp);
            System.out.println("The temperature in Celsius is " + temp2);
        }
        else
        {
            temp2 = (temp * 9/5)  + 32;
            System.out.println("Your temperature in Celsius is: " +temp);
            System.out.println("The temperature in Fahrenheit is " + temp2);
        }

    }
}
