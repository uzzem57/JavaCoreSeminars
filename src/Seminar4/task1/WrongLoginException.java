package Seminar4.task1;

public class WrongLoginException extends RuntimeException{
    private int countLog;
    public  WrongLoginException (int countLog){
        super();
        this.countLog = countLog;
    }

    @Override
    public String toString() {
        return String.format("Ваш логин не корректной длины, должен быть меньше 20 символов, введеный пароль содержит -%d. ", countLog);
    }
}
