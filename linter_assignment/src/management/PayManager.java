package management;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program calculates salary pay
 * @author Husrav Khomidov
 * @version 1.0
 */
public class PayManager
{

    public static final int HOURS_ADDED = 12;

    /**
     * The main program code
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args)
    {
        String name;
        //run a second test
        try (Scanner console = new Scanner(System.in))
        {
            for (int i = 0; i < 3; i++) {
                //enter a name
                System.out.print("Enter a name: ");
                name = console.nextLine();

                //get a pay rate and print the pay
                System.out.print("Enter a payrate: ");
                double payRate = console.nextDouble();
                console.nextLine();

                //enter an amount of hours
                System.out.print("Enter # of hours: ");
                int hours = console.nextInt();
                console.nextLine();

                //pad hours by 12
                hours += HOURS_ADDED;

                PayCalculator calculator = new PayCalculator(payRate, name);
                double pay = calculator.calculatePay(false, hours);

                System.out.println("Pay: $" + pay);
                System.out.println();
            }

        }
        catch (InputMismatchException ex)
        {
            System.out.println("Input Mismatch Exception");
        }
        catch (Exception ex)
        {
            System.out.println("Error!");
        }
    }
}
