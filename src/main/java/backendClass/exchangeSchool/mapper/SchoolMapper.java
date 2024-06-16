package backendClass.exchangeSchool.mapper;

import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.dto.UserInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {
    List<SchoolDto> getAllInfo();
    List<SchoolDto> detail(Integer id);
    List<SchoolDto> searchInfo(String kw);

    int setUserInfo(UserInfoDto userInfoDto);
    List<SchoolDto> matchResult(UserInfoDto userInfoDto);
}
