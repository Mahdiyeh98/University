package rezaei.mahdiyeh.university.dto.student;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.user.AddUserDTO;

@Getter
@Setter
public class AddStudentDTO extends AddUserDTO {
    @Positive
    private long stdNumber;

    @NotBlank
    private String academicLevelString;
}
