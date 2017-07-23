package tutorialDatabaseServer.command;

import java.util.List;

public class TutorialWeb {
    String title;

    List<ImageWeb> imageWebList;

    public TutorialWeb(String title, List<ImageWeb> imageWebList ){
        this.title = title;
        this.imageWebList = imageWebList;
    }

    public List<ImageWeb> getImageWebList() {
        return imageWebList;
    }

    public void setImageWebList(List<ImageWeb> imageWebList) {
        this.imageWebList = imageWebList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





}
