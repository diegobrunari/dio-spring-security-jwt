package dio.spring.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Spring Security API";
    }
    @GetMapping("/users")
    public String users(){
        return "U S E R authorized";
    }
    @GetMapping("/managers")
    public String managers(){
        return "M A N A G E R authorized";
    }
}
