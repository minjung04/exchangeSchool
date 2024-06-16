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
public class SetService {
    private final SchoolMapper mapper;
    public int setInfo(UserInfoDto dto){
        System.out.println(dto.getGpa());
        return 1;
    }

}
