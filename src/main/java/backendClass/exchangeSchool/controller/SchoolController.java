package backendClass.exchangeSchool.controller;

import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.service.SetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SchoolController {

    private final SetService setService;

    @GetMapping("/main")
    public String goMain(UserInfoDto dto){
        System.out.println("page on");
        return "main";
    }

    @PostMapping("/setInfo") //데이터 저장 컨트롤러
    public int setInfo(@RequestBody UserInfoDto dto){
        System.out.println("setinfo controller");
        return setService.setInfo(dto);
    }
    @GetMapping("/search")
    public String search(@RequestBody UserInfoDto dto){
        System.out.println("search page on");
        return "search";
    }



}
