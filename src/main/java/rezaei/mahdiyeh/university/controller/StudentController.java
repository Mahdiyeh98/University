package rezaei.mahdiyeh.university.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rezaei.mahdiyeh.university.entity.Student;
import rezaei.mahdiyeh.university.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("student/v1/")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        studentService.deleteById(id);
    }

    @GetMapping("find/{id}")
    public Student findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @GetMapping("list")
    public List<Student> findAll(){
        return studentService.findAll();
    }


}
