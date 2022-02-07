public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int result = (int) service.calculate(1_000_000, 9.99, 12 );
        System.out.println("ежемесячный процент по кредиту на 1 год: " + result + " руб.");


        int result2 = (int) service.calculate(1_000_000, 9.99, 24 );
        System.out.println("ежемесячный процент по кредиту на 2 года: " + result2 + " руб.");


        int result3 = (int) service.calculate(1_000_000, 9.99, 36 );
        System.out.println("ежемесячный процент по кредиту на 3 года: " + result3 + " руб.");
    }
}