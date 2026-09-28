import java.time.LocalDate;

public class Instructor {


    private String id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private InstructorTitle title; // Enum: öğr.gör, dr vs.
    private java.time.LocalDate hireDate;
    private boolean isActive;

    private Department department;

    private String specialization;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorTitle getTitle() {
        return title;
    }

    public void setTitle(InstructorTitle title) {
        this.title = title;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Instructor(String id, String employeeNo, String nationalId, String firstName, String lastName, String email, InstructorTitle title, LocalDate hireDate, boolean isActive, Department department, String specialization) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.hireDate = hireDate;
        this.isActive = isActive;
        this.department = department;
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return "Instructor{" +
                "id='" + id + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", title=" + title +
                ", hireDate=" + hireDate +
                ", isActive=" + isActive +
                ", department=" + department +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}