package Day4;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

       String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db";
       String query = "select * from jobs";

       try (Connection conn = DriverManager.getConnection(url); ){

           Statement st =conn.createStatement();
           ResultSet rs = st.executeQuery(query);


           while (rs.next()){
               job j = new job (rs);
               System.out.println(j);
           }
       }catch (SQLException e){
           throw  new RuntimeException(e);
       }

    }
}
