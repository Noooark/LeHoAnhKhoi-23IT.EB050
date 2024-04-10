import java.util.Date;

public class Employee implements IEmployee {
    private String ID;
    private String FullName;
    private Date BirthDay;
    private String Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;

    public Employee(String ID, String fullName, Date birthDay, String phone, String email, String employee_type, int employee_count) {
        this.ID = ID;
        this.FullName = fullName;
        this.BirthDay = birthDay;
        this.Phone = phone;
        this.Email = email;
        this.Employee_type = employee_type;
        this.Employee_count = employee_count;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birth Day: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
        System.out.println("Employee Count: " + Employee_count);
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.BirthDay = birthDay;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmployeeType() {
        return Employee_type;
    }

    public void setEmployeeType(String employee_type) {
        this.Employee_type = employee_type;
    }

    public int getEmployeeCount() {
        return Employee_count;
    }

    public void setEmployeeCount(int employee_count) {

        this.Employee_count = employee_count;
    }
}
