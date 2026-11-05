public class BankAccount {
    private String owner;
    private double balance;
    private final String accountNumber;
    private String pin;
    private double overdraftLimit;


    public BankAccount(String owner, double openingBalance, String InitialPin) {
        setOwner(owner);
        this.balance = Math.max(openingBalance, 0);
        this.accountNumber = "AC" + (int)(Math.random() * 9000 + 1000);

        if (InitialPin != null && InitialPin.matches("\\d{4}")) {
            this.pin = InitialPin;
        }else {
            throw new IllegalArgumentException("Initial Pin must be 4 digits");

        }
    }
    public String getOwner() {return owner;}
    public double getBalance() {return balance;}
    public String getAccountNumber() {return accountNumber;}

    public void setOwner(String Owner){
        if (owner == null || owner.isBlank()){
         throw new IllegalArgumentException("Owner name cannot be empty");
        }
        this.owner =owner.trim();
    }
    //EXERCISE 4.3
    public void setOverdraftLimit(double overdraftLimit){
        if (overdraftLimit < 0){
            throw new IllegalArgumentException("Overdrafy Limit cannot be negative ");
        }
        this.overdraftLimit = overdraftLimit;
    }
    // EXERCISE 4.1
    public boolean changePin(String OldPin, String newPin){
        if(!this.pin.equals(OldPin)){
            System.out.println("PIN change failed: Incorrect Old pin");
            return false;
        }
        if (newPin == null || !newPin.matches("\\d{4}")){
            throw new IllegalArgumentException("New pin must be exactly 4 digits");
        }
        this.pin = newPin;
        System.out.println("pPIN successfully Updated");
        return true;
    }
    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }
    public boolean withdraw(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance ){
            System.out.println("Declined: Insufficient Funds");
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public String toString(){
        return String.format("%s [%s] N%.2f", owner, accountNumber, balance);
    }
    }


