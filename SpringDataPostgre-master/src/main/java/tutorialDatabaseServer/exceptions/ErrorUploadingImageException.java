package tutorialDatabaseServer.exceptions;

public class ErrorUploadingImageException extends RuntimeException {
    private Integer imageCount;

    public ErrorUploadingImageException(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Integer getImageCount() {
        return imageCount;
    }
}
