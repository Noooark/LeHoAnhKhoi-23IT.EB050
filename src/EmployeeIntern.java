import java.util.Date;

public class EmployeeIntern extends Employee{
    private String Majors;
    private String Semester;
    private String University_name;

    public EmployeeIntern(String ID, String fullName, Date birthDay, String phone, String email, String employee_type, int employee_count, String majors, String semester, String university_name) {
        super(ID, fullName, birthDay, phone, email, employee_type, employee_count);
        this.Majors = majors;
        this.Semester=semester;
        this.University_name=university_name;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester " + Semester);
        System.out.println("University_name " + University_name);
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }
}
