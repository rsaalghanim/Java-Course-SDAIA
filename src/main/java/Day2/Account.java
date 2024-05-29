package Day2;

public class Account {
    String name;
    double balance;
   double annualRate = 0.04;


   public Account (String name,double balance) {
       this.name=name;
       this.balance=balance;

   }

   public double  getMonthlyRate(){
      return annualRate / 12;
   }

    public double getMonthlyInt(){
        return getMonthlyRate()* balance;
    }
    public void deposit(double amt){
      balance =balance+  amt;
    }

    public void withdraw(double amt) {
        balance = balance - amt;
    }

    public double getBalance(){
    return balance;
    }
}
