package Day2;

import java.util.Scanner;

public class callMethod {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

       double fullMark=100;

        System.out.println("enter mark");
        double mark = sc.nextDouble();

        double grade = MyMethod.calcMarks(mark,fullMark);

        String grades= MyMethod.getGrade(grade);

        System.out.println("your mark is " + grade + ", " + grades );
    }
}
