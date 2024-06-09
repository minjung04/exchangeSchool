package backendClass.exchangeSchool.service;

import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.mapper.SchoolMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}