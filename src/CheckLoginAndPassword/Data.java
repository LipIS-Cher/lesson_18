package CheckLoginAndPassword;

public class Data {

    private String login;

    private String password;

    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkValuable(login, password, confirmPassword);
    }

    public void checkValuable(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
         if (login == null && !login.isEmpty() && !login.isBlank()){
             throw new WrongLoginException("Имя пользователя не заполнено", this);
         } else {
             for(int i = 0; i < login.length(); i++){
                 char c = login.charAt(i);
                 if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c == '_')){
                     throw new WrongLoginException("Внимательнее к знакам, которые могу присутствовать в имени пользователя", this);
                 }
                 if (i >= 20){
                     throw new WrongLoginException("Превышено количество символов в имени пользователя", this);
                 }
             }
             this.login = login;
         }
         if (password == null && !password.isEmpty() && !password.isBlank()){
            throw new WrongPasswordException("Пароль не указан", this);
         } else {
             for(int i = 0; i < password.length(); i++){
                 char c = password.charAt(i);
                 if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c == '_')){
                     throw new WrongPasswordException("Внимательнее к знакам, которые могу присутствовать в пароле", this);
                 }
                 if (i >= 20){
                     throw new WrongPasswordException("Превышено количество символов в пароле", this);
                 }
             }
             this.password = password;
         }
        if (confirmPassword == null && !confirmPassword.isEmpty() && !confirmPassword.isBlank()){
            throw new WrongPasswordException("Повторный пароль не указан", this);
        } else {
            if (confirmPassword.equals(password)) {
                this.confirmPassword = confirmPassword;
            } else {
                throw new WrongPasswordException("Пароли не совпадают", this);
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
