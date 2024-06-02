package Day3;

public class Account {

    private String name;
    private double balance;
    private double annualRate;


    public Account (String name , double balance , double annualRate){
        this.name = name;
        this.balance = balance;
        this.annualRate = annualRate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public double widththrough( double amount){
          balance-=amount;
          return balance;
    }
}
