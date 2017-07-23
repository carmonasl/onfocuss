package tutorialDatabaseServer.exceptions;

public class ImageNotFoundException extends RuntimeException {
    private Integer imageId;

    public ImageNotFoundException(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getImageId() {
        return imageId;
    }
}
