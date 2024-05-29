package Day2;

public class TestEmployee {
    public static void main(String[] args) {
        Emplyee x = new Emplyee( "ragad" , 30000, 2020);
        Emplyee m = new Emplyee( "shmook" , 50000, 2015);

        System.out.println(x.name);
        System.out.println(x.calcSalary());
        System.out.println(x.calcPeriod());

        System.out.println("...............");

        System.out.println(m.name);
        System.out.println(m.calcSalary());
        System.out.println(m.calcPeriod());
    }
}
