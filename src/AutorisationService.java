import exeption.WrongArgumentExeption;
import exeption.WrongLoginException;
import exeption.WrongPasswordExeption;

public class AutorisationService {
    public static final String VALIDATE_PATTERN = "^[a-zA-Z0-9-_]+$";

    public static void check(Autorisation autorisation1) {
        if (autorisation1.getLogin().length() > 20 || !autorisation1.getLogin().matches(VALIDATE_PATTERN)) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException i) {
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


