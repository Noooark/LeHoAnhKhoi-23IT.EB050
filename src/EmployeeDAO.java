import java.sql.*;

public class EmployeeDAO {
    private Connection connection;

    public void createEmployee(Employee employee) {
        try {

            String query = "INSERT INTO Employee (FullName, BirthDay, Phone, Email, Employee_type, Employee_count, ExpInYear, ProSkill, Graduation_date, Graduation_rank, Education, Majors, Semester, University_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            preparedStatement.setString(1, employee.getFullName());
            preparedStatement.setDate(2, employee.getBirthDay());
            preparedStatement.setString(3, employee.getPhone());
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setString(5, employee.getEmployeeType());
            preparedStatement.setInt(6, employee.getEmployeeCount());
            preparedStatement.setInt(7, employee.getExpInYear());
            preparedStatement.setString(8, employee.getProSkill());
            preparedStatement.setDate(9, employee.getGraduationDate());
            preparedStatement.setString(10, employee.getGraduationRank());
            preparedStatement.setString(11, employee.getEducation());
            preparedStatement.setString(12, employee.getMajors());
            preparedStatement.setInt(13, employee.getSemester());
            preparedStatement.setString(14, employee.getUniversityName());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee readEmployee(int employeeId) {
        Employee employee = null;

        try {

            String query = "SELECT * FROM Employee WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            preparedStatement.setInt(1, employeeId);


            ResultSet resultSet = preparedStatement.executeQuery();


            if (resultSet.next()) {

                employee = new Employee(
                        resultSet.getInt("ID"),
                        resultSet.getString("FullName"),
                        resultSet.getDate("BirthDay"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Email"),
                        resultSet.getString("Employee_type"),
                        resultSet.getInt("Employee_count"),
                        resultSet.getInt("ExpInYear"),
                        resultSet.getString("ProSkill"),
                        resultSet.getDate("Graduation_date"),
                        resultSet.getString("Graduation_rank"),
                        resultSet.getString("Education"),
                        resultSet.getString("Majors"),
                        resultSet.getInt("Semester"),
                        resultSet.getString("University_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }

    public void updateEmployee(Employee employee) {
        try {

            String query = "UPDATE Employee SET FullName = ?, BirthDay = ?, Phone = ?, Email = ?, Employee_type = ?, Employee_count = ?, ExpInYear = ?, ProSkill = ?, Graduation_date = ?, Graduation_rank = ?, Education = ?, Majors = ?, Semester = ?, University_name = ? WHERE ID = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);


            preparedStatement.setString(1, employee.getFullName());
            preparedStatement.setDate(2, employee.getBirthDay());
            preparedStatement.setString(3, employee.getPhone());
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setString(5, employee.getEmployeeType());
            preparedStatement.setInt(6, employee.getEmployeeCount());
            preparedStatement.setInt(7, employee.getExpInYear());
            preparedStatement.setString(8, employee.getProSkill());
            preparedStatement.setDate(9, employee.getGraduationDate());
            preparedStatement.setString(10, employee.getGraduationRank());
            preparedStatement.setString(11, employee.getEducation());
            preparedStatement.setString(12, employee.getMajors());
            preparedStatement.setInt(13, employee.getSemester());
            preparedStatement.setString(14, employee.getUniversityName());
            preparedStatement.setInt(15, employee.getId());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int employeeId) {
        try {

            String query = "DELETE FROM Employee WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            preparedStatement.setInt(1, employeeId);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}