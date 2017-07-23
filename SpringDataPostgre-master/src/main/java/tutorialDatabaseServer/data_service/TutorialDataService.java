package tutorialDatabaseServer.data_service;

import tutorialDatabaseServer.domain.Tutorial;

public interface TutorialDataService {
    Long saveTutorial(Tutorial tutorial);
    Tutorial loadTutorial(String uri);
}
