package backendClass.exchangeSchool.service;

import backendClass.exchangeSchool.dto.UserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class SetService {

    public int setInfo(UserInfoDto dto){
        System.out.println(dto.getGpa());
        return 1;
    }
}
