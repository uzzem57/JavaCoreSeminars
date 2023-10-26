package Seminar4.task1;

public class PasswordCheck {
    /**\
     * метод проверки соответствеия логина и пароля заданным условиям
     * @param login логин
     * @param password пароль
     * @param confirmPassword подтверждение пароля
     * @return результат работы метода
     */
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
