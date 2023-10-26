package Seminar4.task1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(passwordCheck.passwordCheck("dbrааw", "errt", "errt"));
        }
        catch (WrongLoginException e){
            e.printStackTrace();
        }
        catch (WrongPassswordException e){
            e.printStackTrace();
        }
    }

}
