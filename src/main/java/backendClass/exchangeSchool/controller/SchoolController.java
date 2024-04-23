package backendClass.exchangeSchool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    @GetMapping("/main")
    public String goMain(Model model){
        System.out.println("page on");
        return "main";
    }

    @GetMapping("/search")
    public String search(Model model){
        System.out.println("search page on");
        return "search";
    }
}
