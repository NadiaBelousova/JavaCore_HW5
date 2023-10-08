public class Autorisation {
    String login;
    String password;
    String confirmPass;

    public Autorisation(String login, String password, String confirmPass) {
        this.login = login;
        this.password = password;
        this.confirmPass = confirmPass;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPass() {
        return confirmPass;
    }
}
