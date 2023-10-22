package Seminar3.task1;

import java.util.Comparator;
import java.util.Date;

public class Employee {

    private String birthDate;
    public Employee(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Метод сравнивает две подаваемые даты в заданном формате
     * @param date1 - первая дата
     * @param date2 - второя дата
     * @return возвращает численный результат сравнения
     */
    public static int compare(Date date1, Date date2){
        return date1.after(date2) ? 1 : -1;

        }

    }


