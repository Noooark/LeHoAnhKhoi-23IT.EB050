import java.util.Date;

public class EmployeeFresher extends Employee{
    private Date Graduation_date;
    private String Graduation_rank;
    private String Education;
    public EmployeeFresher(String ID, String fullName, Date birthDay, String phone, String email, String employee_type, int employee_count, Date graduation_date, String graduation_rank, String education) {
        super(ID, fullName, birthDay, phone, email, employee_type, employee_count);
        this.Graduation_date = graduation_date;
        this.Graduation_rank = graduation_rank;
        this.Education = education;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation_date: " + Graduation_date);
        System.out.println("Graduation_rank " + Graduation_rank);
        System.out.println("Education " + Education);
    }

    public Date getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(Date graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}
