package rezaei.mahdiyeh.university.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rezaei.mahdiyeh.university.entity.Course;
import rezaei.mahdiyeh.university.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("course/v1/")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public Course update(@RequestBody Course course){
        return courseService.update(course);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        courseService.deleteById(id);
    }

    @GetMapping("find/{id}")
    public Course findById(@PathVariable Long id){
        return courseService.findById(id);
    }

    @GetMapping("list")
    public List<Course> findAll(){
        return courseService.findAll();
    }

}
