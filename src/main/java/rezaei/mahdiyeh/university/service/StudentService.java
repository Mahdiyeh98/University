package rezaei.mahdiyeh.university.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rezaei.mahdiyeh.university.entity.Student;
import rezaei.mahdiyeh.university.exception.ConflictException;
import rezaei.mahdiyeh.university.exception.NotFoundException;
import rezaei.mahdiyeh.university.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public Student save(Student student) {
        Optional<Student> optionalStudent;
        optionalStudent = studentRepository.findByStdNumber(student.getStdNumber());
        if (optionalStudent.isPresent())
            throw new ConflictException("Student already exists.");

        optionalStudent = studentRepository.findByNationalCode(student.getNationalCode());
        if(optionalStudent.isPresent())
            throw new ConflictException("National Code already exists.");

        optionalStudent = studentRepository.findByUsername(student.getUsername());
        if (optionalStudent.isPresent())
            throw new ConflictException("Username already exists");

        return optionalStudent.get();
    }

    public Student update(Student student){
        findById(student.getId());
        return studentRepository.save(student);
    }

    public void deleteById(Long id){
        findById(id);
        studentRepository.deleteById(id);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty())
            throw new NotFoundException("404! Student does not exist.");
        return student.get();
    }


}
