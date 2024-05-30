package Day2;

public class SavingAccount extends Account {
    private double limit;

    public SavingAccount(String name, double balance,  double limit) {
        super(name, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }


    @Override
    public void withdraw(double amt) {
        if (getBalance() -amt >=limit){
        super.withdraw(amt);
            System.out.println("done");
    }else {
            System.out.println("invalid");
        }
}
}