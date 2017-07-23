package tutorialDatabaseServer.data_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorialDatabaseServer.command.ImageCmd;
import tutorialDatabaseServer.command.ImageWeb;
import tutorialDatabaseServer.data_access.ImageRepository;
import tutorialDatabaseServer.data_service.ImageDataService;
import tutorialDatabaseServer.domain.Image;
import tutorialDatabaseServer.exceptions.ErrorUploadingImageException;

import java.util.ArrayList;
import java.util.List;

//import tutorialDatabaseServer.domain.Image;

@Service
public class ImageDataServiceImpl implements ImageDataService {

    @Autowired
    protected ImageRepository imageRepository;

    public List<ImageWeb> loadImages(Long tutorialId){
        List<ImageWeb> imageWebList = new ArrayList<>();
//        List<Image> imageList = new ArrayList<>();
        List<Image> imageList = imageRepository.findByTutorial(tutorialId);
        imageList.stream().forEach((image) -> imageWebList.add(convertToImageWeb(image)));
        return imageWebList;
    }

    public ImageWeb convertToImageWeb(Image image){
        return new ImageWeb(image.getCodedImage(),image.getComment());
    }

    public List<ImageCmd> findAll() {
//        List<Image> images = imageRepository.findAll();
        List<ImageCmd> returnImages = new ArrayList<>();
//        images.stream().forEach((image) -> returnImages.add(setImageCmd(image)));
        return returnImages;
    }

    //    protected ImageCmd setImageCmd(Image image) {
////        return new ImageCmd(image.getImage(), image.getUploader(), image.getTutorial(), image.getFileType());
//        return null;
//    }
//    protected Image setImage(ImageCmd imageCmd){
////        return new Image(imageCmd.getImage(), imageCmd.getUploader(), imageCmd.getTutorial(), imageCmd.getFileType());
//  return null;
//    }
    public boolean saveImages(List<ImageCmd> images){
//        images.stream().forEach((image) -> imageRepository.save(setImage(image)));
        return true;
    }
    public void saveImage(Image image){
        try {
            imageRepository.save(image);
        }
        catch(Exception exception){
            throw new ErrorUploadingImageException(1);
        }
    }

}
