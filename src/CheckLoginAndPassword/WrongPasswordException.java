package CheckLoginAndPassword;

public class WrongPasswordException extends Exception{

    private final Data password;

    public WrongPasswordException(String message, Data password) {
        super(message);
        this.password = password;
    }

    public Data getPassword() {
        return password;
    }
}
