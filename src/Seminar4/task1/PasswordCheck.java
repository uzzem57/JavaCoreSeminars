package Seminar4.task1;

public class PasswordCheck {
    public static boolean passwordCheck( String login, String password, String confirmPassword ){
        boolean check = password.equals(confirmPassword);
        int countLogin = login.length();
        int countPassword = password.length();

        if (countLogin >=20){
            throw new WrongLoginException(countLogin);
        }
        else if (countPassword >= 20 || !check ){
            throw new WrongPassswordException(countPassword, check);
        }
        else {
            return true;
        }
    }
}
