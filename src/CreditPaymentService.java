public class CreditPaymentService {
    public float calculate(double sum, double pyear, double month) {
       double pmonth = pyear / (month * 100);
       double summonth = sum * (pmonth + ((pmonth / (Math.pow((1 + pmonth), month)) - 1)));

        return summonth;
    }
}
