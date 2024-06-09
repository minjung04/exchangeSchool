package backendClass.exchangeSchool.controller;

import backendClass.exchangeSchool.dto.IdDto;
import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.service.GetService;
import backendClass.exchangeSchool.service.SetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.net.URISyntaxException;

@RequiredArgsConstructor
@RestController
public class SchoolController {

    private final SetService setService;
    private final GetService getService;
    private static final Logger logger = LoggerFactory.getLogger(GetController.class);


    @PostMapping("/setInfo") //데이터 저장 컨트롤러
    public int setInfo(@RequestBody UserInfoDto dto){
        System.out.println("setinfo controller");
        return setService.setInfo(dto);
    }

    @RequestMapping("/goWebSite")
    public int goWebSite(@RequestBody SchoolDto dto){
        return 0;
    }


}
