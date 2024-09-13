package rezaei.mahdiyeh.university.dto.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.AddBaseDTO;

@Setter
@Getter
public class AddCourseDTO extends AddBaseDTO {
    @Positive
    private int code;

    @NotBlank
    private String title;

    @NotBlank
    private int units;
}
