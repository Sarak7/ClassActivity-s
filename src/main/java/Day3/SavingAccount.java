package Day3;

public class SavingAccount extends Account{

    private double limit;

    public SavingAccount(String name, double balance, double annualRate) {
        super(name, balance, annualRate);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double widththrough(double amount) {
        if (getBalance() - amount >= getLimit() ){
            return super.widththrough(amount);

        }
        else  {
            return getBalance();
        }
    }
}
