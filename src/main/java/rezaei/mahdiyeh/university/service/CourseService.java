package rezaei.mahdiyeh.university.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rezaei.mahdiyeh.university.entity.Course;
import rezaei.mahdiyeh.university.exception.ConflictException;
import rezaei.mahdiyeh.university.exception.NotFoundException;
import rezaei.mahdiyeh.university.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public Course save(Course course) {
        Optional<Course> course1 = courseRepository.findByCode(course.getCode());
        if (course1.isPresent())
            throw new ConflictException("The course is available.");
        return courseRepository.save(course);
    }

    public Course findById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isEmpty())
            throw new NotFoundException("404! Course not found.");
        return courseRepository.save(course.get());
    }

    public Course update(Course course) {
        findById(course.getId());
        return courseRepository.save(course);
    }

    public void deleteById(Long id){
        findById(id);
        courseRepository.deleteById(id);
    }

    public List<Course> findAll(){
        return courseRepository.findAll();
    }
}

