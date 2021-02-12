package Project.fruitspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //문자가 아닌 객체를 넘김. 결과값이 { name: "spring!!" } 이렇게 뜸. 그런데 이것은 json 방식임. {"key : value"}로 이루어져있음.

    }
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
