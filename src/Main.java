import CheckLoginAndPassword.Data;
import CheckLoginAndPassword.WrongLoginException;
import CheckLoginAndPassword.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        Data user1 = null;
        try {
            user1 = new Data("Lofin", "asas", "asas");
            user1.checkValuable(user1.getLogin(), user1.getPassword(), user1.getConfirmPassword());
            System.out.println("True");
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка с логином " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка с паролем " + e.getMessage());
        }
        try {
            Data user2 = new Data("ADsadasdasfasdfasdfasdfs", "asdasdas", "asdasdas");
            user2.checkValuable(user2.getLogin(), user2.getPassword(), user2.getConfirmPassword());
            System.out.println("True");
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка с логином " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка с паролем " + e.getMessage());
        }
        try {
            Data user3 = new Data("asdasdasdas", "0909asasdfasdfasdfasdfasdf", "0909asasdfasdfasdfasdfasdf");
            user3.checkValuable(user3.getLogin(), user3.getPassword(), user3.getConfirmPassword());
            System.out.println("True");
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка с логином " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка с паролем " + e.getMessage());
        }
        try {
            Data user4 = new Data("sadasdasd", "asda", "asdasdfasdfasdf");
            user4.checkValuable(user4.getLogin(), user4.getPassword(), user4.getConfirmPassword());
            System.out.println("True");
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка с логином " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка с паролем " + e.getMessage());
        }

    }

//    public static void check(Data... users) {
//        for (Data user: users) {
//            try {
//                user.checkValuable(user.getLogin(), user.getPassword(), user.getConfirmPassword());
//                System.out.println("True");
//            } catch (WrongLoginException e) {
//                System.out.println("Произошла ошибка с логином  " + e.getLogin());
//            } catch (WrongPasswordException e) {
//                System.out.println("Произошла ошибка с паролем" + e.getPassword());
//            }
//        }
//    }
}