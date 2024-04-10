import java.util.Date;

public class EmployeeExperience extends Employee{
    private int ExpInYear;
    private String ProSkill;
    public EmployeeExperience(String ID, String fullName, Date birthDay, String phone, String email, String employee_type, int employee_count, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employee_type, employee_count);
        this.ExpInYear = expInYear;
        this.ProSkill = proSkill;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience in Year: " + ExpInYear);
        System.out.println("Professional Skill: " + ProSkill);
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        this.ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        this.ProSkill = proSkill;
    }
}
