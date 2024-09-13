package rezaei.mahdiyeh.university.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import rezaei.mahdiyeh.university.dto.course.AddCourseDTO;
import rezaei.mahdiyeh.university.dto.course.UpdateCourseDTO;
import rezaei.mahdiyeh.university.dto.course.ViewCourseDTO;
import rezaei.mahdiyeh.university.entity.Course;

@Component
@AllArgsConstructor
public class CourseMapper {
    private final ModelMapper modelMapper;

    public Course toEntity(AddCourseDTO addCourseDTO) {
        return modelMapper.map(addCourseDTO, Course.class);
    }

    public Course toEntity(UpdateCourseDTO updateCourseDTO) {
        return modelMapper.map(updateCourseDTO, Course.class);
    }

    public ViewCourseDTO toViewDTO(Course course){
        ViewCourseDTO viewCourseDTO = modelMapper.map(course, ViewCourseDTO.class);

        if (course.getProfessor() != null){
            String professorFullName = course.getProfessor().getName() + " " + course.getProfessor().getFamily();
            viewCourseDTO.setProfessorName(professorFullName);
        }
        return null;
    }








}
