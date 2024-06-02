package Day4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class job {
  private String job_title;
  private double min_salary;
  private double max_salary;

    public job() {
    }

    public job(String job_title, double min_salary, double max_salary) {
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(double min_salary) {
        this.min_salary = min_salary;
    }

    public double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(double max_salary) {
        this.max_salary = max_salary;
    }


    public job (ResultSet rs) throws SQLException {
        job_title = rs.getString("job_title");
        max_salary=rs.getDouble("max_salary");
        min_salary=rs.getDouble("min_salary");
    }
    @Override
    public String toString() {
        return "job{" +
                "job_title='" + job_title + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }
}
