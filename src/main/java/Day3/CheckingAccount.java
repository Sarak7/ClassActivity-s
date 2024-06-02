package Day3;

public class CheckingAccount extends Account {


    public CheckingAccount(String name, double balance, double annualRate, double limit) {
        super(name, balance, annualRate);

    }

    @Override
    public double widththrough(double amount) {
        if(getBalance() - amount >0){
            return super.widththrough(amount);
        }
        else  {
            return getBalance();
            }
    }
}
