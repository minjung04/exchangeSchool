package backendClass.exchangeSchool.controller;

import backendClass.exchangeSchool.dto.IdDto;
import backendClass.exchangeSchool.dto.SchoolDto;
import backendClass.exchangeSchool.dto.UserInfoDto;
import backendClass.exchangeSchool.service.GetService;
import backendClass.exchangeSchool.service.SetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
        model.addAttribute("allSchool", getService.getAllSchool());
        return "search";
    }


    @GetMapping("/detail")
    public String detail(Model model,IdDto data){
        System.out.println("123:::"+data.getId());
        Integer id = data.getId();
        model.addAttribute("details",getService.getDetail(id));
        System.out.println("model:::"+model);
        logger.info("받은 ID: {}", id);
        logger.info("모델: {}", model);

        return "detail";
    }

}
