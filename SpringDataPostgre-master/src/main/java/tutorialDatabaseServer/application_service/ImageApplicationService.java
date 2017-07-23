package tutorialDatabaseServer.application_service;

import tutorialDatabaseServer.command.ImageCmd;
import tutorialDatabaseServer.command.ImageWeb;

import java.util.List;

public interface ImageApplicationService {
    List<ImageCmd> getImages();
    List<ImageWeb> loadImages(Long tutorialId);
//    boolean addImages(TutorialCmd tutorial);
}
