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
    private String language;
    private String master_yn;
    private String rest_yn;
    private String grade;
    private String language_class_yn;
    private String gpa;
    private String spring_start;
    private String spring_end;
    private String fall_start;
    private String fall_end;
    /*@Override
    public String toString() {
        return "userForm{" +
                "user='" + user_name + '\'' +
                "master_yn='" + master_yn + '\'' +
                "language='" + language + '\'' +
                '}';
    }*/
}
