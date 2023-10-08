import exeption.WrongArgumentExeption;
import exeption.WrongLoginException;
import exeption.WrongPasswordExeption;

public class Main {

    public static void main(String[] args) {
        Autorisation autorisation1 = new Autorisation("vasia_78", 124, 1234);
        AutorisationService.check(autorisation1);

    }
}


