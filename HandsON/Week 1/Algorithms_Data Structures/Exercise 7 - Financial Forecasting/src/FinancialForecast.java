public class FinancialForecast {
    public double predictFutureValue(double currentValue, double growthRate, int numberOfYears){

            if(numberOfYears == 0){
                return currentValue;
            }

            double preValue = predictFutureValue(currentValue,growthRate,numberOfYears - 1);

           return preValue * (1 + growthRate);

    }
}
