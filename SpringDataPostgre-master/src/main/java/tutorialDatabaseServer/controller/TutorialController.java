package tutorialDatabaseServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tutorialDatabaseServer.application_service.TutorialApplicationService;
import tutorialDatabaseServer.command.TutorialCmd;
import tutorialDatabaseServer.command.TutorialWeb;

import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/tutorial")
public  class TutorialController {

    @Autowired
    protected TutorialApplicationService tutorialApplicationService;

    @RequestMapping(method = POST)
    public String post(@RequestParam TutorialCmd tutorialCmd) throws IOException {
        return tutorialApplicationService.handleTutorial(tutorialCmd);
    }

    @RequestMapping(method = GET)
    public TutorialWeb get (@RequestParam(value="uri", defaultValue="Index") String uri) {
       return tutorialApplicationService.getTutorialWeb(uri);
    }

}
