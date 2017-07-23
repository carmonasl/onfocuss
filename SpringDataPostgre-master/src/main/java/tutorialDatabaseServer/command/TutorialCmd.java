package tutorialDatabaseServer.command;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TutorialCmd {

    private String tutorialName;

    private List<ImageDb> imageDbList;

    public TutorialCmd() {
        imageDbList = new ArrayList<ImageDb>();
    }

    public void addImageDb(ImageDb imageDb) {
        imageDbList.add(imageDb);
    }

    public ImageDb getImageDb(Integer imageDbPosition) {
        return imageDbList.get(imageDbPosition);
    }

    public List<ImageDb> getImageDbList() {
        return imageDbList;
    }

    public void setImageDbList(List<ImageDb> imageDbList) {
        this.imageDbList = imageDbList;
    }

    public TutorialCmd(String tutorialName, List<ImageDb> imageDbList) {
        this.tutorialName = tutorialName;
        this.imageDbList = imageDbList;
    }

    public String getTutorialName() {
        return tutorialName;
    }

    public void setTutorialName(String tutorialName) {
        this.tutorialName = tutorialName;
    }

}


