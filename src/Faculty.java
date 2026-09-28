import java.time.LocalDateTime;

public class Faculty {

    private String id;
    private String code;
    private String name;
    private Instructor dean;
    private String phone;
    private String email;
    private boolean isActive;
    private  LocalDateTime createdAt;

    public Faculty(String id, String code, String name, Instructor dean,
                   String phone, String email, boolean isActive,
                   LocalDateTime createdAt) {

        this.id = id;
        this.code = code;
        this.name = name;
        this.dean = dean;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Instructor getDean() {
    return dean;
}

public void setDean(Instructor dean) {
    this.dean = dean;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public boolean isActive() {
    return isActive;
}

public void setActive(boolean active) {
    isActive = active;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}
    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dean=" + dean +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", createdAt=" + createdAt +
                '}';
    }
}