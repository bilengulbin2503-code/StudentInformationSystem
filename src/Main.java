import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(
                "1",
                "230504002",
                "11122233344",
                "Gulbin",
                "Bilen",
                LocalDate.of(2004, 3, 25),
                "gulbin@atlas.edu.tr",
                "5523283214",
                "Istanbul",
                null,
                2024,
                3,
                "photo.jpg",
                LocalDateTime.now(),
                null,                          // Gender enum
                null                           // StudentStatus enum
        );

        // 3. /* We add the student we created to the list
        students.add(student1);

        // 4. Listedeki ogrencileri konsola yazdiriyoruz
        System.out.println("--- SISTEME KAYITLI OGRENCILER ---");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}