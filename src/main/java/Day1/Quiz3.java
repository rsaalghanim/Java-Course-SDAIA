package Day1;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number");
        String number = sc.nextLine();

        if (number.length() != 10 ){
            System.out.println("Invalid length");

        } else if (number.startsWith("05")) {

            int digitCount =0;

            for ( int i = 0 ; i < number.length(); i++){

                char c=  number.charAt(i);

              if (Character.isDigit(c)){

                   digitCount = digitCount +1 ;
                   if (digitCount == 10) {
                     System.out.println(" Number is valid");
              }
                }  else {
                    System.out.println( " Invalid !, entries contain letters" );
                    break;
                }

            }

        }else {
            System.out.println("Invalid !, Number must start with '05' ");
        }

    }
}
