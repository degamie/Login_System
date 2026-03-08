package com.example.Spring_MVC_App.Spring_MVC_App.Controller;

@Controller
@RestController
public class UserController {
    public UserController userController;
    @GetMapping("/")
    public ModelAndView modelAndView(@RequestBody User user){
        return "Login page"+user;
    }
    @GetMapping("/saveAll/{UserName}")
    public String getUserName(@RequestParam "UserName" String UserName ,@RequestBody User user) {
        return "UserName" + UserName.Length;}//Fetching Username in Server

}
