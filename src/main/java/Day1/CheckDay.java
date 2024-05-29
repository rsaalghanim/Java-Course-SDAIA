package Day1;

import java.util.Scanner;

public class CheckDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a day number");

        int day = sc.nextInt();

        if (day >= 1 && day<=4){
            System.out.println("work day");
        } else if ( day == 7) {
            System.out.println("work day");
        } else if (day ==5 || day ==6) {
            System.out.println("off day");
        } else {
            System.out.println("invalid input");
        }

//        switch (day){
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("monday");
//                break;
//            case 3:
//                System.out.println("tusday");
//                break;
//
//
//            case 4:
//                System.out.println("wedenday");
//                break;
//
//            case 5:
//                System.out.println("thursday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//                break;
//        }
//
//        switch (day){
//            case 1 ->
//                System.out.println("sunday");
//
//            case 2->
//                System.out.println("monday");
//
//            case 3->
//                System.out.println("tusday");
//
//
//            case 4->
//                System.out.println("wedenday");
//
//
//            case 5 ->
//                System.out.println("thursday");
//
//            case 6->
//                System.out.println("friday");
//
//            case 7->
//                System.out.println("saturday");
//
//        }

    }
}
