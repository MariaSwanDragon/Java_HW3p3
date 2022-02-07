public class CreditPaymentService {
    public double calculate(double sum, double pyear, int month) {
        double pmonth = pyear / 100 / 12;
        double summonth = sum * (pmonth + pmonth / (Math.pow(1 + pmonth, month) - 1));

        return summonth;
    }
}
