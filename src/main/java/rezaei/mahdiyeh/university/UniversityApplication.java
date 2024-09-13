package rezaei.mahdiyeh.university;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rezaei.mahdiyeh.university.entity.Course;
import rezaei.mahdiyeh.university.entity.Student;
import rezaei.mahdiyeh.university.enums.AcademicLevel;
import rezaei.mahdiyeh.university.service.CourseService;
import rezaei.mahdiyeh.university.service.StudentService;

@AllArgsConstructor
@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {

    private final CourseService courseService;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
/*
        Course course1 = new Course();
        course1.setCode(1);
        course1.setTitle("Course 1");

        course1.setUnits(3);

        courseService.save(course1);
*/

        if(courseService.findAll().isEmpty()){
            Course course = new Course();
            course.setCode(4);
            course.setTitle("course4");
            course.setUnits(3);
            course = courseService.save(course);

            Student student = new Student();
            /*student.setName("name1");
            student.setFamily("family1");
            student.setBirthDay(new Date());
            student.setGender(Gender.FEMALE);*/
            student.setStdNumber(1234567890L);
            student.setAcademicLevel(AcademicLevel.PHD);
            /*student.setNationalCode(9876543210L);
            student.setUsername("username1");
            student.setPassword("password1");*/
            studentService.save(student);

            /*course.getStudents().add(student);*/
            courseService.update(course);
        }
    }
}
