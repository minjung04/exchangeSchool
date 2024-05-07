package backendClass.exchangeSchool.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class GetController {

    @GetMapping("/matching")
    public String matching(Model model){
        System.out.println("matching page on");
        return "/matching";
    }

    @GetMapping("/result")
    public String result(Model model){
        System.out.println("result page on");
        return "/result";
    }
}
