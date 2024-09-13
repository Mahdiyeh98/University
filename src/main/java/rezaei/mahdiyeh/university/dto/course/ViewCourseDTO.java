package rezaei.mahdiyeh.university.dto.course;

import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.ViewBaseDTO;

import java.util.List;

@Getter
@Setter
public class ViewCourseDTO extends ViewBaseDTO {
    private int code;
    private String title;
    private int units;
    private String professorName;
    private List<Long> studentNumbers;
}
