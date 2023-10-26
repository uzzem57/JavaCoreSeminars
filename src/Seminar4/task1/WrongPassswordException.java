package Seminar4.task1;

public class WrongPassswordException extends RuntimeException{
    private int countPass;
    private boolean checkPass;

    public WrongPassswordException(int countPass, boolean checkPass) {
        super();
        this.countPass = countPass;
        this.checkPass = checkPass;
    }

    @Override
    public String toString() {
        boolean state = countPass >= 20;

        if (state) {
            return "Пароль шляпа, ты можешь лучше! Сделай меньше символов!";
        } else if (!state && !checkPass) {
            return "Пароль все еще шляпа, теперь не совпадает с проверкой!";
        }
        else
            return "Все ОК!";

    }
}
