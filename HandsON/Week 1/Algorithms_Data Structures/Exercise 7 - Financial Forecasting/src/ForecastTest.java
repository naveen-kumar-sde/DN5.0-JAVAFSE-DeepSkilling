public class ForecastTest {
    public static void main(String[] args) {
        double currentValue = 1000;
        double growthRate = 0.10;
        int years = 3;

        FinancialForecast cast = new FinancialForecast();

        System.out.print(cast.predictFutureValue(currentValue,growthRate,years));
    }
}
