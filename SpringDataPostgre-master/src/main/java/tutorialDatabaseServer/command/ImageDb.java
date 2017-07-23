package tutorialDatabaseServer.command;

import java.util.ArrayList;
import java.util.List;

public class ImageDb {
    private List<byte[]> encodedImageList;
    private String comment;


    public ImageDb() {
        this.encodedImageList = new ArrayList<>();
    }

    public void addEncodedImage(byte[] encodedImage){
        encodedImageList.add(encodedImage);
    }

    public byte[] getEncodedImage(int imagePosition){
        return encodedImageList.get(imagePosition);
    }

    public List<byte[]> getEncodedImageList() {
        return encodedImageList;
    }

    public void setEncodedImageList(List<byte[]> encodedImageList) {
        this.encodedImageList = encodedImageList;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
