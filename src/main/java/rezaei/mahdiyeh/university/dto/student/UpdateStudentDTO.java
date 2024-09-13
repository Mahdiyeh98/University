package rezaei.mahdiyeh.university.dto.student;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.user.UpdateUserDTO;

@Setter
@Getter
public class UpdateStudentDTO extends UpdateUserDTO {
    @NotBlank
    private String academicLevelString;

}
