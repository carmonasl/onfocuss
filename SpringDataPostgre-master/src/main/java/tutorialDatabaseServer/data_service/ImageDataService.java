package tutorialDatabaseServer.data_service;

import tutorialDatabaseServer.command.ImageCmd;
import tutorialDatabaseServer.command.ImageWeb;
import tutorialDatabaseServer.domain.Image;

import java.util.List;

public interface ImageDataService {
    List<ImageCmd> findAll();
    void saveImage(Image image);
    List<ImageWeb> loadImages(Long tutorialId);
}
