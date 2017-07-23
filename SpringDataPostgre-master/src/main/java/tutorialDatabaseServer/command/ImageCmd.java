package tutorialDatabaseServer.command;

public class ImageCmd {
    private String image;
    private String imageType;
    private String comment;

    public ImageCmd() {
    }

    public ImageCmd(String image, String imageType, String comment) {
        this.image = image;
        this.imageType = imageType;
        this.comment = comment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
