package tutorialDatabaseServer.data_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorialDatabaseServer.command.TutorialCmd;
import tutorialDatabaseServer.data_access.TutorialRepository;
import tutorialDatabaseServer.data_service.TutorialDataService;
import tutorialDatabaseServer.domain.Tutorial;
import tutorialDatabaseServer.exceptions.ErrorUploadingImageException;

@Service
public class TutorialDataServiceImpl implements TutorialDataService {

    @Autowired
    protected TutorialRepository tutorialRepository;

    public Long saveTutorial(Tutorial tutorial){
        try {
            Tutorial tutorialSaved = tutorialRepository.save(tutorial);
            return tutorialSaved.getId();
        }
        catch(Exception exception){
            throw new ErrorUploadingImageException(1);
        }
    }

    public Tutorial loadTutorial(String uri){
        return tutorialRepository.findByUri(uri).get(0);
    }

    public Long saveTutorialWithPassword(TutorialCmd tutorialCmd, String link){
        return null;
    }

}
