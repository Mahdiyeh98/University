package rezaei.mahdiyeh.university.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.AddBaseDTO;

@Getter
@Setter
public class AddUserDTO extends AddBaseDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String family;

    @Positive
    private long nationalCode;

    @NotBlank
    private String genderString;

    @NotNull
    private Long birthDayTimeStamp;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
