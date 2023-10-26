package Seminar4.task1;

public class passwordCheck {
    public static boolean passwordCheck( String login, String password, String confirmPassword ){
        boolean check = password.equals(confirmPassword);
        int countLogin = login.length();
        int countPassword = password.length();

        if (countLogin >=20){
            throw new WrongLoginException(countLogin);
        }
        else if (countLogin < 20 || check == false){
            throw new WrongPassswordException(countPassword, check);
        }
        else {
            return true;
        }
    }
}
