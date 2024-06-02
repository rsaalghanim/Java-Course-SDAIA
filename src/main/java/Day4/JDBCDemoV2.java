package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemoV2 {
    public static void main(String[] args) {
        var sc =new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\Day4\\hr.db";
        String query = "insert into jobs values (?, ?, ?,?)";


        try( Connection conn = DriverManager.getConnection(url);) {

            PreparedStatement st = conn.prepareStatement(query);

            System.out.println("enter job id");
            int job_id = sc.nextInt();
            st.setInt(1,job_id);
            sc.nextLine();

            System.out.println("enter job title");
            String job_title = sc.nextLine();
            st.setString(2,job_title);

            System.out.println("enter min salary");
            double min_salary = sc.nextDouble();
            st.setDouble(3,min_salary);

            System.out.println("enter max salary");
             double max_salary = sc.nextDouble();
            st.setDouble(4,max_salary);

            int row = st.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
