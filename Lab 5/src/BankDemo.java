public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Amaka", 100000, 0.06);
        CurrentAccount c = new CurrentAccount("Bola", 5000, 20000);

        System.out.println(" INITIAL ACCOUNT STATES");
        System.out.println(s);
        System.out.println(c);

        System.out.println(" PERFORMING TRANSACTIONS");

        s.deposit(50000);
        s.addMonthlyInterest();
        System.out.println();

        System.out.println("Attempting to withdraw N20,000 from Bola's account:");
        c.withdraw(20000);

        System.out.println("\n=== FINAL ACCOUNT STATES ===");
        System.out.println(s);
        System.out.println(c);

    }
}