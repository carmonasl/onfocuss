package tutorialDatabaseServer.application_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorialDatabaseServer.application_service.ImageApplicationService;
import tutorialDatabaseServer.command.ImageCmd;
import tutorialDatabaseServer.command.ImageDb;
import tutorialDatabaseServer.command.ImageWeb;
import tutorialDatabaseServer.command.TutorialCmd;
import tutorialDatabaseServer.data_service.ImageDataService;
import tutorialDatabaseServer.domain.Image;

import java.util.List;

@Service
public class ImageApplicationServiceImpl implements ImageApplicationService {

    @Autowired
    protected ImageDataService imageDataService;

    public void saveImages(TutorialCmd tutorialCmd, Long tutorialId){
        tutorialCmd.getImageDbList().forEach(imageDb -> saveImage(convertToImage(imageDb,tutorialId)));
    }

    public void saveImage(Image image){
        imageDataService.saveImage(image);
    }

    public Image convertToImage(ImageDb imageDb,Long tutorialId){
        Image image = new Image();
        image.setComment(image.getComment());
        image.setCodedImage(imageDb.getEncodedImage(0));
        image.setTutorial(tutorialId);
//        image.setPosition();
        return image;
    }

    @Override
    public List<ImageCmd> getImages() {
        return null;
    }

    public List<ImageWeb> loadImages(Long tutorialId){
        return imageDataService.loadImages(tutorialId);
    }

//    public List<ImageCmd> getImages() {
//        return imageDataService.findAll();
//    }

//    public boolean addImages(TutorialCmd tutorial) {
//        ImageCmd[] imageArray = tutorial.getImages();
//        String folderName = TUTORIAL_FOLDER + tutorial.getUploader() + tutorial.getTutorialName();
//        makeFolder(folderName);
//        saveImagesAndHost(imageArray, folderName, tutorial.getUploader(), tutorial.getTutorialName());
//        folderName = HOSTED_TUTORIALS_FOLDER + tutorial.getUploader() + tutorial.getTutorialName();
//        makeFolder(folderName);
//        return saveImagesAndHost(imageArray, folderName, tutorial.getUploader(), tutorial.getTutorialName());
//    }
//
//    protected void makeFolder(String folderName){
//        File imageFolder = new File(folderName);
//        imageFolder.mkdir();
//    }
//
//    protected boolean saveImagesAndHost(ImageCmd[] imageArray, String folderName, String uploader, String tutorialName) {
//        boolean result = true;
//        for (int i = 0; i < imageArray.length; i++) {
//            if (result) {
//                String fileName = uploader + tutorialName + i;
//                result = createImage(imageArray[i].getImage(), imageArray[i].getImageType(), folderName, fileName);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    protected void storeImage(byte[] image, String uploader, String tutorial, String fileType) {
//        File file = new File(uploader + tutorial + DOT + fileType);
//    }
//
//    protected boolean createImage(String imageDataString, String fileType, String folderName, String fileName) {
//        byte[] data = Base64.getDecoder().decode(imageDataString);
//        File file = new File(folderName + SLASH + fileName + DOT + fileType);
//        try (OutputStream stream = new FileOutputStream(file)) {
//            stream.write(data);
//        } catch (IOException exception) {
//            System.out.println("failed creating folder/files");
//            return false;
//        }
//        return true;
//    }
}
