package management;
/**
 * This class calculates the total earned amount
 * @author Husrav Khomidov
 * @version 1.0
 */
public class PayCalculator
{
    public static final int FULL_TIME_HOURS = 40;
    public static final double OVERTIME_PAY = 0.5;
    private double payAmount;
    private String employeeFullName;

    /**
     * This creates a new calculator
     * @param payAmount the amount earned per hour
     * @param employeeFullName the employee full name
     */
    public PayCalculator(double payAmount, String employeeFullName)
    {
        this.payAmount = payAmount;
        this.employeeFullName = employeeFullName;
    }

    /**
     * This returns the total amount pay
     * @param salaried the boolean to check if employee is salaried
     * @param hours the amount of hours worked
     * @return the total amount earned
     */
    public double calculatePay(boolean salaried, int hours)
    {
        if (salaried)
        {
            return payAmount;
        }
        else
        {
            double total = hours * payAmount;

            if (hours > FULL_TIME_HOURS)
            {
                total += hours * (OVERTIME_PAY * payAmount);
            }

            return total;
        }
    }

    @Override
    public String toString(){
        return "Pay Amount: " + payAmount + "; Employee Full Name: " + employeeFullName;
    }
}
