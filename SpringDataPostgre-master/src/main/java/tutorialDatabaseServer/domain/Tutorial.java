package tutorialDatabaseServer.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "tutorial")
public class Tutorial {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "uri")
    private String uri;
    private String name;
    private String password;

    public Tutorial(){}

    public Tutorial(String uri, String name) {
        this.uri = uri;
        this.name = name;
        if(name==null){
            this.name="";
        }
    }

    public Tutorial(String uri, String name, String password) {
        this.uri = uri;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
