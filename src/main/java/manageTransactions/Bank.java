package manageTransactions;

public class Bank implements moneyMovement{
    private double balance;
    private boolean overDraw;
    private boolean isCorporate;

    public Bank(){
        updateBalance(15);
        checkCorporate();
        overDraw = false;
    }

    public Bank(double amount, boolean flag){
        updateBalance(amount);
        checkCorporate();
        setOverDraw(flag);
    }

    public double getBalance() {
        return this.balance;
    }

    public void updateBalance(double amount){
        this.balance = amount;
    }

    public boolean isOverDraw() {
        return this.overDraw;
    }

    public void setOverDraw(boolean flag){
        this.overDraw = flag;
    }

    public void resetOverDraw(){
        setOverDraw(false);
    }

    public void deposit(double amount) {
        updateBalance(getBalance()+amount);
    }

    public boolean isCorporate() { return this.isCorporate; }

    public boolean withDraw(double amount) {
        if (getBalance() - amount >= 0) {
            updateBalance(getBalance() - amount);
            return true;
        }
        else{
            setOverDraw(true);
            System.out.println("Insufficient funds!\n"+"You cannot withdraw "+amount);
            return false;
        }
    }

    public void checkCorporate(){
        if (getBalance() >= 80000){
            System.out.println("Account updated: Corporate User");
            isCorporate = true; }
        else {
            System.out.println("Account updated: Personal User");
            isCorporate = false;
        }
    }
}
