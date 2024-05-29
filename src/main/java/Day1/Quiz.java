package Day1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //نبغا يضرب اعداد رانودم واليوز يكتب الناتج وييطلع له اذا الجواب صح او لا
        //الراندوم ماتطلع عدد الا بين الصفر بالواحد واحنا نبيه نطاع عدد بين الصفر والعشره فضربنا ب 10
       //حطينا (int) عسام نسوي كاستينق من عدد بفواصل لعدد انتجر
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        //System.out.println("what is" + x + "*" + y + "?");
        System.out.printf("what is %d * %d ?", x, y );
        int answer =sc.nextInt();

        if (answer == x*y){
            System.out.println("correct");
        }else {
            System.out.println("wrong");
        }
    }
}
