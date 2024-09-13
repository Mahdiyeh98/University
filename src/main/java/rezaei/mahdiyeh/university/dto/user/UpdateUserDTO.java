package rezaei.mahdiyeh.university.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.UpdateBaseDTO;

@Getter
@Setter
public class UpdateUserDTO extends UpdateBaseDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String family;

    @NotBlank
    private String genderString;

    @NotNull
    private Long birthDayTimeStamp;

    @NotBlank
    private String password;
}
