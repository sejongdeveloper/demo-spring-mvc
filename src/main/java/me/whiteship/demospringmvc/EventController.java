package me.whiteship.demospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {
    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String events(Model model) {
        return "events";
    }
}
