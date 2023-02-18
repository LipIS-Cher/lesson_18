package CheckLoginAndPassword;

public class WrongLoginException extends Exception{

    private final Data login;

    public WrongLoginException(String message, Data login) {
        super(message);
        this.login = login;
    }

    public Data getLogin(){
        return login;
    }
}
