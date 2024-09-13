package rezaei.mahdiyeh.university.dto.professor;

import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.user.ViewUserDTO;

import java.util.List;

@Setter
@Getter
public class ViewProfessorDTO extends ViewUserDTO {
    private int code;
    private String academicRankString;
    private List<Integer> courseCodes;
}
