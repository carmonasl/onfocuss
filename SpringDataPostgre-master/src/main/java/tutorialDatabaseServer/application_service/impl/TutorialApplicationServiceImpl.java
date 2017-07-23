package tutorialDatabaseServer.application_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorialDatabaseServer.application_service.TutorialApplicationService;
import tutorialDatabaseServer.command.ImageWeb;
import tutorialDatabaseServer.command.TutorialCmd;
import tutorialDatabaseServer.command.TutorialWeb;
import tutorialDatabaseServer.data_service.TutorialDataService;
import tutorialDatabaseServer.domain.Tutorial;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Random;

@Service
public class TutorialApplicationServiceImpl implements TutorialApplicationService {

    @Autowired
    protected TutorialDataService tutorialDataService;

    //@Autowired
    protected ImageApplicationServiceImpl imageApplicationService;


    public String handleTutorial (TutorialCmd tutorialCmd) throws UnknownHostException {
        String uri= generateRandomUri();
        Long tutorialId= saveTutorial(tutorialCmd, uri);
        imageApplicationService.saveImages(tutorialCmd,tutorialId);
        return generateTutorialLink(uri);
    }

    public TutorialWeb getTutorialWeb(String uri){
        Tutorial tutorial= loadTutorial(uri);
        List<ImageWeb> imageWebList = imageApplicationService.loadImages(tutorial.getId());
        return new TutorialWeb(tutorial.getName(),imageWebList);
    }

    public Tutorial loadTutorial(String uri){
        return tutorialDataService.loadTutorial(uri);
    }

    public Long saveTutorial(TutorialCmd tutorialCmd, String uri) {
        return  tutorialDataService.saveTutorial(new Tutorial(uri,tutorialCmd.getTutorialName()));
    }

    public String generateRandomUri(){
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String generateTutorialLink(String uri) throws UnknownHostException {
        return  getHost() + generateUriParameter(uri);
    }
    public String generateUriParameter(String uri){
        return  "/tutorial" + "?uri=" + uri;
    }

    public String getHost() throws UnknownHostException{
        return "https://"+ InetAddress.getLocalHost().getHostName();
    }


}
