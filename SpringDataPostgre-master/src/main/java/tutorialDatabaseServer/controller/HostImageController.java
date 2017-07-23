package tutorialDatabaseServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/hosted")
public class HostImageController {

    @RequestMapping(method = GET)
    public String hostImage(){
        return "image";
    }
}
