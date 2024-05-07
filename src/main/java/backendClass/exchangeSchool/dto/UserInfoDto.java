package backendClass.exchangeSchool.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserInfoDto {
    private String user_name;
    private String user_num;
    private String lang;
    private String master;
    private String loa;
    private String grade;
    private String language_class;
    private String level;
    private String gpa;
    private String springStart;
    private String springEnd;
    private String fallStart;
    private String fallEnd;
}
