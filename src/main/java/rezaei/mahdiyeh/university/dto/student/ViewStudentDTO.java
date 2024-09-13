package rezaei.mahdiyeh.university.dto.student;

import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.user.ViewUserDTO;

import java.util.List;

@Setter
@Getter
public class ViewStudentDTO extends ViewUserDTO {
    private long stdNumber;
    private String academicLevelString;
    private List<Integer> courseCodes;
}
