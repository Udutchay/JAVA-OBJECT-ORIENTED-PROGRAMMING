public class SavingsAccount extends Account{
    private double annualRate;
    public SavingsAccount(String owner, double opening, double annualRate){
        super(owner, opening);
        this.annualRate = annualRate;
    }
    public void addMonthlyInterest() {
        double interest = balance * annualRate / 12.0;
        deposit(interest);
        System.out.printf("Interest of N%.2f added .%n", interest);
    }
}
