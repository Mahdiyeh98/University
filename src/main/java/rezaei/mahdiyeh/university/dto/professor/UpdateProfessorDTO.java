package rezaei.mahdiyeh.university.dto.professor;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.user.UpdateUserDTO;
@Getter
@Setter
public class UpdateProfessorDTO extends UpdateUserDTO {
    @NotBlank
    private String academicRankString;
}
