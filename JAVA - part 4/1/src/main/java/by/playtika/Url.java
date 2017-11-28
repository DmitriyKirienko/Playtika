package by.playtika;

public class Url {
    private static final String url = "https://api.github.com/repos/DmitriyKirienko/Playtika/collaborators";
    private String token;

    public Url (String token) {
        this.token = token;
    }
    public String getUserList() {
        return url + "?access_token=" + token;
    }
    public String getInvite(String name) {
        return url + "/" + name + "?access_token=" + token;
    }

}
