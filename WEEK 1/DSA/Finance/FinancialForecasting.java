public class FinancialForecasting {
    static double futureValue(double amount, double rate, int years){
        if (years == 0){
            return amount;
        }
        return futureValue(amount * (1+rate), rate, years-1);
    }
    public static void main(String[] args) {
        double present = 1000;
        double rate = 0.05;
        int years = 5;
        double res = futureValue(present, rate, years);
        System.out.println("Future Value after " + years + " years = " + res);
    }
}

