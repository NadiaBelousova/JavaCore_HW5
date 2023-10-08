public class Autorisation {
    String login;
    int password;
    int confirmPass;

    public Autorisation(String login, int password, int confirmPass) {
        this.login = login;
        this.password = password;
        this.confirmPass = confirmPass;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public int getConfirmPass() {
        return confirmPass;
    }

    public void check() {
    }
}
