package tutorialDatabaseServer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tutorialDatabaseServer.application_service.ImageApplicationService;
import tutorialDatabaseServer.application_service.TutorialApplicationService;
import tutorialDatabaseServer.command.TutorialCmd;

import java.io.IOException;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    protected ImageApplicationService imageApplicationService;
    @Autowired
     protected TutorialApplicationService tutorialApplicationService;


    @RequestMapping(method = RequestMethod.POST)
    public String get(@RequestBody TutorialCmd tutorialCmd) throws IOException {
        tutorialApplicationService.handleTutorial(tutorialCmd);
        return "Printed OK";
    }

//        byte[] bytesImage = Base64.getDecoder().decode(tutorialCmd.getImageDb(0).getEncodedImage(0));
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytesImage);
//        BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
//        byteArrayInputStream.close();
//        File image = new File("imageTest.png");
//        ImageIO.write(bufferedImage,"png",image);


//    @RequestMapping(method = POST)
//    @ResponseStatus(CREATED)
//    public String add(@RequestBody String image) {
//        // System.out.println("in here" + tutorial.getImages()[0].getComment());
//        boolean result = image.equals("test");
//
//        if(result!=true) {
//            System.out.println("failure");
//            throw new ErrorUploadingImageException(1);
//        }
//        System.out.println("success");
//        return "images uploaded successfully";
//    }

//    @RequestMapping(method = POST)
//    @ResponseStatus(CREATED)
////    public String add(@RequestBody TutorialCmd tutorial) {
//    public String add(@RequestBody TutorialCmd tutorialCmd) {
//       // System.out.println("in here" + tutorial.getImages()[0].getComment());
////       boolean result =  tutorialApplicationService.addTutorial(tutorial);
////        if(result){
////            result = saveComments(tutorial);
////
////        }
////        if(result!=true) {
////            System.out.println("failure");
////            throw new ErrorUploadingImageException(1);
////        }
//        System.out.println("success");
////        ImageCmd[] x = tutorialCmd.getImages();
//        return "images uploaded successfully";
//    }
//    protected boolean saveComments(TutorialCmd tutorial){
//        boolean result = commentApplicationService.saveComments(tutorial);
//        if(result){
//            result = imageApplicationService.addImages(tutorial);
//        }
//        return result;
//    }

//    @ExceptionHandler(ImageNotFoundException.class)
//    @ResponseStatus(NOT_FOUND)
//    public ServiceError imageNotFound(ImageNotFoundException exception){
//        Integer id = exception.getImageId();
//        ServiceError serviceError = new ServiceError(4, "image not found for image " + id);
//        return serviceError;
//    }
//    @ExceptionHandler(ErrorUploadingImageException.class)
//    @ResponseStatus(FORBIDDEN)
//    public ServiceError uploadUnsuccessful(ErrorUploadingImageException exception){
//        Integer numberOfImages = exception.getImageCount();
//        ServiceError serviceError = new ServiceError(4, "Error uploading " + numberOfImages + " images");
//        return serviceError;
//    }
}
