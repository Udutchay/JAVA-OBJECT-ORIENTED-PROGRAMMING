//EXERCISE 5.1
public class FixedDepositAccount extends Account{
    private boolean IsMature;

    public FixedDepositAccount(String owner, double openingBalance){
         super(owner, openingBalance);
         this.IsMature = false;
    }
    public void setMature(boolean mature) {
        this.IsMature = mature;
    }

   // @Override
    public boolean withdraw(double amount) {
        if (!IsMature) {
            System.out.println("Withdrawal refused: Fixed deposit has not reached maturity.");
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " (Fixed Deposit - Mature: " + IsMature + ")";
    }
}

