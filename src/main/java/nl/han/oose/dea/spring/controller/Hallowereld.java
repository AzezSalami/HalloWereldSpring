package nl.han.oose.dea.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Hallowereld {

    @GetMapping("/hallo")
    public @ResponseBody String Hallo(){
        return "Hallo Wereld";
    }
}
