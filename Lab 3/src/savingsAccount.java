//EXERCISE 3.3
public class savingsAccount {
    String owner, accountNumber;
    double balance;

    static int accountsCreated = 0;
    //EXERCISE 3.4
    static int totalAccounts(){
        return accountsCreated;
    }
    savingsAccount(String owner, double openingBalance){
        this.owner = owner;
        this.balance = openingBalance;
        accountsCreated++;
        this.accountNumber = "SAV" + (1000 + accountsCreated);
    }
    void deposit (double amount){
        if(amount <= 0){
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount;
    }
    void withdraw(double amount){
        if (amount > balance){
            System.out.println("Sorry, Insufficient balance");
            return;
        }
        if (amount >= 0){
            System.out.println("Please Enter A Valid Number");
            return;
        }
        balance -= amount;
    }
    void transfer (savingsAccount rep, double amount){
        if (amount <= 0){
            System.out.println("Enter a valid amount");
            return;
        }
        if (amount > balance){
            System.out.println("Sorry, Your Transfer could not be completed");
        }
        this.balance -= amount;
        rep.balance += amount;
    }
    @Override
    public String toString(){
        return String.format("%s [%s] balance = %.2f" + owner, accountNumber, balance);
    }
    public static void main(String[] args){

    }
}
