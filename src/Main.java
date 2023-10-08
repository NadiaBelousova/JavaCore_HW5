import exeption.WrongArgumentExeption;
import exeption.WrongLoginException;
import exeption.WrongPasswordExeption;

public class Main {

    public static void main(String[] args) {

        Autorisation autorisation1 = new Autorisation("vasia_78", 1234, 1234);
        try {
            check(autorisation1);
        } catch (WrongLoginException i) {
            System.out.println("неправильный логин");
        } catch (WrongPasswordExeption e) {
            System.out.println("неправильный пароль");
        } catch (WrongArgumentExeption e) {
            System.out.println("введите пароль и логин");
        }
    }

    public static final String PATTERN = "^[a-zA-Z0-9-_]+$";

    public static void check(Autorisation autorisation1) throws WrongArgumentExeption, WrongPasswordExeption, WrongLoginException {
        if (autorisation1.getLogin().length() > 20 || !autorisation1.getLogin().matches(PATTERN)) {
            throw new WrongLoginException();
        } else if (autorisation1.getPassword() != autorisation1.getConfirmPass()) {
            throw new WrongPasswordExeption();
        } else if (autorisation1.getLogin().isEmpty() || autorisation1.getPassword() == 0 || autorisation1.getConfirmPass() == 0) {
            throw new WrongArgumentExeption();
        } else {
            System.out.println("вы зашли успешно");
        }
    }
}


