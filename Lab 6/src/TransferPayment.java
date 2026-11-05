public class TransferPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("TRANSFER IS BEING PROCESSED FOR "+ amount);
    }
}
