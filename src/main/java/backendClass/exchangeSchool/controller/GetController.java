package backendClass.exchangeSchool.controller;

import backendClass.exchangeSchool.dto.IdDto;
import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.dto.searchDto;
import backendClass.exchangeSchool.service.GetService;
import backendClass.exchangeSchool.service.SetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class GetController {
    @Autowired
    private final GetService getService;
    private final SetService setService;
    private static final Logger logger = LoggerFactory.getLogger(GetController.class);


    @GetMapping("/matching")
    public String matching(Model model){
        System.out.println("matching page on");
        return "/matching";
    }

    @GetMapping("/matchingResult")
    public String result(Model model){
        System.out.println("result page on");
       /* model.addAttribute("user","오민정");*/
        return "matchingResult";
    }

    @GetMapping("/")
    public String main(Model model){
        return "/main";
    }

    @GetMapping("/search")
    public String search(Model model){
        model.addAttribute("allSchool", getService.getAllSchool());
        return "search";
    }


    @GetMapping("/detail")
    public String detail(Model model,IdDto data){
        Integer id = data.getId();
        model.addAttribute("details",getService.getDetail(id));
        return "detail";
    }

    @GetMapping("/searchResult")
    public String searchResult(Model model, searchDto searchDto){
        System.out.println("kw ::"+searchDto.toString());
        model.addAttribute("info",getService.searchInfo(searchDto.getKw()));
        System.out.println("model:::222"+model);
        return "searchResult";
    }

    @PostMapping("/matchingResult")
    public String matchingResult(Model model, UserInfoDto userInfoDto){
        System.out.println("userinfoDto ::: "+ userInfoDto);
        System.out.println("matching");
        return "";
    }
        /*@GetMapping("/goWebSite")
    public String goWebSite(@RequestParam(value = "url",defaultValue = "") String url){
        System.out.println("url :::: "+url);
//        return new ModelAndView("redirect:" + projectUrl);
        return "";
    }*/

}
