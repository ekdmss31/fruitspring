package Project.fruitspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("login")
    public String login(Model model) {
        model.addAttribute("data","hello!!");
        return "Login";
    }

    //MVC
    @GetMapping("login-mvc")
    public String loginMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name",name);
        return "Login";
    }

    @GetMapping(value = "/sign")
    public String signFrom(){
        return "sign";
    }
}
