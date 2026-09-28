public class CoursePrerequisite {
    @Override
    public String toString() {
        return "CoursePrerequisite{" +
                "id='" + id + '\'' +
                ", course=" + course +
                ", prerequisiteCourse=" + prerequisiteCourse +
                ", type=" + type +
                ", minGrade='" + minGrade + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getPrerequisiteCourse() {
        return prerequisiteCourse;
    }

    public void setPrerequisiteCourse(Course prerequisiteCourse) {
        this.prerequisiteCourse = prerequisiteCourse;
    }

    public PrerequisiteType getType() {
        return type;
    }

    public void setType(PrerequisiteType type) {
        this.type = type;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    public CoursePrerequisite(String id, Course course, Course prerequisiteCourse, PrerequisiteType type, String minGrade) {
        this.id = id;
        this.course = course;
        this.prerequisiteCourse = prerequisiteCourse;
        this.type = type;
        this.minGrade = minGrade;
    }

    private String id;

    // Yabancı Anahtarlar (FK) - Hangi dersin önkoşulu hangi ders?
    private Course course;
    private Course prerequisiteCourse;

    private PrerequisiteType type; // Enum: zorunlu, önerilen
    private String minGrade;
}
