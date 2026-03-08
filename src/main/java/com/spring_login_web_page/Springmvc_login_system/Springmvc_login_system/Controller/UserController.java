package com.example.Spring_MVC_App.Spring_MVC_App.Controller;

@Controller
@RestController
public class UserController {
    public UserController userController;
    @GetMapping("/")
    public ModelAndView modelAndView(@RequestParam "UserName" String UserName){
        return "Login page"+UserName;
    }

}
