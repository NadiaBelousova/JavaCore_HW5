import exeption.WrongArgumentException;
import exeption.WrongLoginException;
import exeption.WrongPasswordException;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Autorisation autorisation1 = new Autorisation("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        try {
            check(autorisation1);
        } catch (WrongLoginException i) {
            System.out.println("неправильный логин");
        } catch (WrongPasswordException e) {
            System.out.println("неправильный пароль");
        } catch (WrongArgumentException e) {
            System.out.println("введите пароль и логин");
        }
    }

    public static final String PATTERN = "^[a-zA-Z0-9-_]+$";

    public static void check(Autorisation autorisation1) throws WrongArgumentException, WrongPasswordException, WrongLoginException {
        if (autorisation1.getLogin().length() > 20 || !autorisation1.getLogin().matches(PATTERN)) {
            throw new WrongLoginException();
        } else if (!Objects.equals(autorisation1.getPassword(), autorisation1.getConfirmPass()) ||!autorisation1.getPassword().matches(PATTERN)) {
            throw new WrongPasswordException();
        } else if (autorisation1.getLogin().isEmpty() || autorisation1.getPassword().isEmpty() || autorisation1.getConfirmPass().isEmpty()) {
            throw new WrongArgumentException();
        } else {
            System.out.println("вы зашли успешно");
        }
    }
}


