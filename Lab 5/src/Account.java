public class Account {
    protected String owner;
    protected double  balance;

    public Account(String owner,double openingBalance){
        this.owner = owner;
        this.balance = Math.max(openingBalance, 0);
    }
    //EXERCISE 5.2
    protected String accountType(){
        return "GENERIC";
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }
    public boolean withdrawal(double amount){
        if(amount > balance){System.out.println("Insufficient funds"); return false;}
            balance -= amount;
            return true;
    }
    public double getBalance() {return balance;}
    @Override

    public String toString() {
        return String.format("[%s] %s: N%.2f",accountType(), owner, balance);
    }
}

