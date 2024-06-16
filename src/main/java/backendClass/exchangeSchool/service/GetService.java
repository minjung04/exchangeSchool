package backendClass.exchangeSchool.service;

import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.mapper.SchoolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetService {

    private final SchoolMapper mapper;
    public List<SchoolDto> getAllSchool(){
        System.out.println("getAllSchool Service");
        List<SchoolDto> getSchool = mapper.getAllInfo();
        System.out.println("getSchool"+getSchool);

        return getSchool;
    }
    public List<SchoolDto> getDetail(Integer id){
        List<SchoolDto> detail =mapper.detail(id);
        System.out.println(detail);
        return detail;
    }

    public List<SchoolDto> searchInfo(String kw){
        System.out.println("kw :::" + kw);
        List<SchoolDto> searchInfo = mapper.searchInfo(kw);
        return searchInfo;
    }

    public int setUserInfo(UserInfoDto infoDto){
        return mapper.setUserInfo(infoDto);
    }

    public List<SchoolDto> matchingInfo(UserInfoDto infoDto){
        List<SchoolDto> matchingInfo = mapper.matchResult(infoDto);
        return matchingInfo;
    }
}
