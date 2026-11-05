public class BankAccount {
    String owner;
    double balance;
    final String accountNumber;
    static int accountsCreated = 0;

    BankAccount(String owner, double openingBalance) {
        this.owner = owner;
        this.balance = openingBalance;
        accountsCreated++;
        this.accountNumber = "AC" + (1000 + accountsCreated);
    }
    //EXERCISE 3.2
    BankAccount(String owner){
        this(owner, 0.0);
    }
        void deposit (double amount) {
            if(amount <=0) {
                System.out.println("Deposit must be positive");
                return;
            }
            balance += amount;
        }
        void withdraw (double amount) {
        if (amount > balance){
            System.out.println("Insufficient Balance for "+ owner);
        }
        }
        //EXERCISE 3.1
        void transfer(BankAccount reciepient, double amount){
        if (amount <= 0){
            System.out.println("Please enter a valid Amount");
            return;
        }
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        }
        this.balance -= amount;
        reciepient.balance += amount;
        }
        @Override
    public String toString() {
        return String.format("%s [%s] balance = %.2f", owner, accountNumber, balance);
        }
        public static void main(String[] args){
        BankAccount amaka = new BankAccount("Amaka", 1000);
        BankAccount bola = new BankAccount("Bola", 1200);
        amaka.deposit(5000);
        amaka.withdraw(1000);
        bola.withdraw(200);
        amaka.transfer(bola, 1000);


        System.out.println(amaka);
        System.out.println("bola");
        System.out.println("Accounts created so far: " +
                + BankAccount.accountsCreated);
        }
    }


