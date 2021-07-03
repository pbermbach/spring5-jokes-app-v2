package guru.springframework.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping("/")
    public String getJokes() {
        return "jokes/joke";
    }
}
