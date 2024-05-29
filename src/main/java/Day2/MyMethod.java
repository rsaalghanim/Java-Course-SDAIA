package Day2;

public class MyMethod {


    public static double calcMarks (double mark, double fullMark){
        return (mark/fullMark) * 100;
    }

    public static String getGrade (double grade){
        if  (grade > 85 ) return "Excillent";
        else if ( grade > 75 )return "v good";
        else if ( grade > 65 )return "good";
        else if ( grade >= 50 )return "pass";
        else return "faild";




    }


}
