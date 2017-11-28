package by.playtika;

import com.fasterxml.jackson.databind.ObjectMapper;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.put;

import com.jayway.restassured.response.Response;

import org.json.JSONException;


public class GithubApi {
    private Url url = new Url("fe4081c6dbee021369ed69b5b363372012f36926");

    public void getListOfUsers() throws JSONException {
        Response resp = get(url.getUserList());
        ObjectMapper mapper = new ObjectMapper();
        try {
            Collaborators[] col = mapper.readValue(resp.asString(), Collaborators[].class);
            for(Collaborators i:col){
                System.out.println(i.getLogin());
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void sendInvite() throws JSONException {
        Response resp = put(url.getInvite("EugeneRomaniuk"));

    }
}
