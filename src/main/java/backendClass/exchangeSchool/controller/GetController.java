package backendClass.exchangeSchool.controller;

import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.service.GetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;

@Controller
@RequiredArgsConstructor
@Slf4j
public class GetController {
    private final GetService getService;

    @GetMapping("/matching")
    public String matching(Model model){
        System.out.println("matching page on");
        return "/matching";
    }

    @GetMapping("/result")
    public String result(Model model){
        System.out.println("result page on");
       /* model.addAttribute("user","오민정");*/
        return "/result";
    }

    @GetMapping("/")
    public String main(Model model){
        return "/main";
    }

    @GetMapping("/search")
    public String search(Model model){
        System.out.println("controller");
        model.addAttribute("allSchool", getService.getAllSchool());
        System.out.println("controller2");
        return "search";
    }
}
