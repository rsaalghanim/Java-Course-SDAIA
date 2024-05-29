package Day2;

public class Emplyee {
    String name;
    double salary;
    int hireYear;


    public Emplyee (String name, double salary, int hireYear){
        this.name = name;
        this.salary =salary;
        this.hireYear = hireYear;

    }

    public double calcSalary() {
        return salary * 12;
    }

    public double calcPeriod() {
        return 2024 - hireYear;
    }


}
