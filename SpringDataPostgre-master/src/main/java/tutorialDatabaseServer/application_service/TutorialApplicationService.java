package tutorialDatabaseServer.application_service;


import tutorialDatabaseServer.command.TutorialCmd;
import tutorialDatabaseServer.command.TutorialWeb;

import java.net.UnknownHostException;

public interface TutorialApplicationService {
    String handleTutorial(TutorialCmd tutorialCmd) throws UnknownHostException;
    TutorialWeb getTutorialWeb(String uri);
}
