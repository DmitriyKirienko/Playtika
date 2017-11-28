package by.playtika;

public class Main {
    public static void main(String[] args) {
        GithubApi githubApi = new GithubApi();

        githubApi.getListOfUsers();
        githubApi.sendInvite();
}
}
