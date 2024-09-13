package rezaei.mahdiyeh.university.dto.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.UpdateBaseDTO;

@Setter
@Getter
public class UpdateCourseDTO extends UpdateBaseDTO {
    @NotBlank
    private String title;

    @Positive
    private int units;
}
