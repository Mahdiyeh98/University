package rezaei.mahdiyeh.university.dto.user;

import lombok.Getter;
import lombok.Setter;
import rezaei.mahdiyeh.university.dto.base.ViewBaseDTO;

@Getter
@Setter
public class ViewUserDTO extends ViewBaseDTO {
    private String name;
    private String family;
    private long nationalCode;
    private String genderString;
    private Long birthDayTimeStamp;
    private String username;
}
