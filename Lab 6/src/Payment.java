public class Payment {
    public void pay(double amount){
         System.out.println("Processing payment");
    }
    public static void checkOut(Payment paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
    public static void main(String[] args){
      Payment myCard = new CardPayment();
      Payment myCash = new CashPayment();

      checkOut(myCard, 4000);
      checkOut(myCash, 3000);
    }

}
