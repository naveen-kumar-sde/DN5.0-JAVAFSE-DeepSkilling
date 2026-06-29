import java.util.Scanner;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive call
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Present Value: ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (in %): ");
        double ratePercent = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        // Convert percentage to decimal
        double growthRate = ratePercent / 100;

        // Function call
        double result = futureValue(presentValue, growthRate, years);

        // Output
        System.out.println("Future Value after " + years + " years = " + result);

        sc.close();
    }
}