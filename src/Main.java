import exeption.WrongArgumentExeption;
import exeption.WrongLoginExeption;
import exeption.WrongPasswordExeption;

public class Main {

    private static final String VALIDATE_PATTERN = "^[a-zA-Z0-9-_]+$";
//    private static Autorisation autorisation;
//    public Main(Autorisation autorisation) {
//        Main.autorisation = autorisation;
//    }

    public static void main(String[] args) {
        Autorisation autorisation1 = new Autorisation("vasia_78", 0, 0);

        check(autorisation1);

    }

    private static void check(Autorisation autorisation1) {
        if (autorisation1.getLogin().length() > 20 || !autorisation1.getLogin().matches(VALIDATE_PATTERN)) {
            try {
                throw new WrongLoginExeption();
            } catch (WrongLoginExeption i) {
                System.out.println("неправильный логин");
            }
        } else if (autorisation1.getPassword() != autorisation1.getConfirmPass()) {
            try {
                throw new WrongPasswordExeption();
            } catch (WrongPasswordExeption e) {
                System.out.println("неправильный пароль");
            }
        } else if (autorisation1.getLogin().isEmpty() || autorisation1.getPassword() == 0 || autorisation1.getConfirmPass() == 0) {
            try {
                throw new WrongArgumentExeption();
            } catch (WrongArgumentExeption e) {
                System.out.println("введите пароль и логин");
                ;
            }
        } else {
            System.out.println("вы зашли успешно");
        }
    }
}
