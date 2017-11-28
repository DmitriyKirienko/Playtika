package by.playtika;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Collaborators {

    @JsonProperty("login")
    private String login;

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }
}
