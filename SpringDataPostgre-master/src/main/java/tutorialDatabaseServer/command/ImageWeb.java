package tutorialDatabaseServer.command;


public class ImageWeb {
    byte[] codedImage;
    String comment;

    public ImageWeb(byte [] codedImage, String comment){
        this.codedImage = codedImage;
        this.comment = comment;
    }

    public ImageWeb(byte[] codedImage){
        this.codedImage=codedImage;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public byte[] getCodedImage() {
        return codedImage;
    }

    public void setCodedImage(byte[] codedImage) {
        this.codedImage = codedImage;
    }
}
