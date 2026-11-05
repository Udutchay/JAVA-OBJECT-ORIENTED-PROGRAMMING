public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String owner, double opening, double overdraftLimit){
        super(owner, opening);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount){
        if (amount > balance + overdraftLimit){
            System.out.println("Beyond overdraft limit");
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public String toString(){
        return super.toString() + "(Overdraft up to N"+ overdraftLimit + ")";
    }
}
