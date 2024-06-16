package backendClass.exchangeSchool.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class searchDto {
    private String kw;

    @Override
    public String toString() {
        return "ArticleForm{" +
                "kw='" + kw + '\'' +
                '}';
    }
}
