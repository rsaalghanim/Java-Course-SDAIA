package Day2;

import Day2.HW2.CheckAccount;

public class TestAccount {
    public static void main(String[] args) {
      // var a1 = new Account("MONA", 400000);
      var s =new SavingAccount("leen",100,50);
      var c = new CheckAccount("nora",1000);
        System.out.println(s.getName()+":");
s.withdraw(50);
s.getBalance();


System.out.println(c.getName()+":");
c.withdraw(100);
//        System.out.println(a1.getAnnualRate());
//        System.out.println(a1.getBalance());
        //System.out.println(s.getBalance());
    }
}
