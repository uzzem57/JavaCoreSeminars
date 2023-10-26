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
        boolean state = countPass <= 20;

        return "Пароль шляпа";
    }
}
