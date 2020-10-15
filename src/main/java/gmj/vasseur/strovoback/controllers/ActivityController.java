package gmj.vasseur.strovoback.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activities")
public class ActivityController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }
    
}
