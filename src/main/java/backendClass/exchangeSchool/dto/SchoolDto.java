package backendClass.exchangeSchool.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class SchoolDto {

    private int id;
    private String school;
    private String country;
    private String language;
    private String discipline;
    private String to2024;
    private String to2025;
    private String website;
    private String period;
    private String master_yn;
    private String country_limit;
    private String rest_yn;
    private String gpa;
    private String program_link;
    private String language_class_yn;
    private String min_grade;
    private String class_link;
    private String on_campus_yn;
    private String off_campus_yn;
    private String start_2024;
    private String end_2024;
    private String vacation;
    private String start_2025;
    private String end_2025;
}
