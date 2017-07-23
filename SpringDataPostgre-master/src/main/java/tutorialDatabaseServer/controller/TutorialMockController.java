package tutorialDatabaseServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tutorialDatabaseServer.command.ImageWeb;
import tutorialDatabaseServer.command.TutorialWeb;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/tutorialMock")
public class TutorialMockController {

    @RequestMapping(method = GET)
    public TutorialWeb loadTutorial (@RequestParam(value="uri", defaultValue="Index") String uri) {
        List<ImageWeb> imageWebList = new ArrayList<>();
//        imageWebList.add(new ImageWeb("asdfasfd","comment"+uri));
        return new TutorialWeb("Title Example",imageWebList);
    }
}
