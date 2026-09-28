import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    private String id;
    private String studentNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private java.time.LocalDate birthDate;
    private String email;
    private String phone;
    private String address;


    private Program program;

    private int enrollmentYear;
    private int classYear;
    private String photoUrl;
    private java.time.LocalDateTime createdAt;


    private Gender gender;
    private StudentStatus status;

    public Student(String id, String studentNo, String nationalId, String firstName, String lastName, LocalDate birthDate, String email, String phone, String address, Program program, int enrollmentYear, int classYear, String photoUrl, LocalDateTime createdAt, Gender gender, StudentStatus status) {
        this.id = id;
        this.studentNo = studentNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.program = program;
        this.enrollmentYear = enrollmentYear;
        this.classYear = classYear;
        this.photoUrl = photoUrl;
        this.createdAt = createdAt;
        this.gender = gender;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", program=" + program +
                ", enrollmentYear=" + enrollmentYear +
                ", classYear=" + classYear +
                ", photoUrl='" + photoUrl + '\'' +
                ", createdAt=" + createdAt +
                ", gender=" + gender +
                ", status=" + status +
                '}';
    }
}
