package tutorialDatabaseServer.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="tutorial")
    private Long tutorial;
    private byte[] codedImage;
    private String comment;
//    private Integer position;



    public Image() {
    }

    public Image(Long tutorial_id, byte[] codedImage, String comment) {

        this.tutorial = tutorial_id;
        this.codedImage=codedImage;
        this.comment=comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTutorial() {
        return tutorial;
    }

    public void setTutorial(Long tutorial) {
        this.tutorial = tutorial;
    }


//    public Integer getPosition() {
//        return position;
//    }
//
//    public void setPosition(Integer position) {
//        this.position = position;
//    }

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
