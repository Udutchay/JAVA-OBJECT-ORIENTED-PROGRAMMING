public class CashPayment extends Payment{

    @Override
    public void pay(double amount){
        System.out.println("CASH PAYMENT FOR "+ amount+ " IS BEING PROCESSED");
    }
}
