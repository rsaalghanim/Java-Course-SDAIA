package Day3;
import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRW {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter file name");
        var fileName =sc.nextLine();

     //  var file1 = new File ("C:\\Users\\dev\\Desktop\\Words.txt");
        var counts = new HashMap<Character,Integer>();

        try {
            var fsc = new Scanner(new File(fileName));
        while (fsc.hasNext()){
           // for (var c:fsc)
        }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
