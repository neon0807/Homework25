package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerNew {

@GetMapping("/")
    public String showPublicInfo() {
        return "publicInfo";
    }

    @GetMapping("employe_info")
    public String showEmployee(){
        return "employeInfo";
    }

    @GetMapping("it_info")
    public String showIT(){
        return "itInfo";
    }

    @GetMapping("stuff_info")
    public String showStuff(){
        return "stuffInfo";
    }

    @GetMapping("director_info")
    public String showDirector(){
        return "directorInfo";
    }
}
