package Seminar3.task1;
// Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в
// виде трёх чисел гггг-мм-дд, без использования условного оператора.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Employee employee1 = new Employee("2018-09-11");
        Employee employee2 = new Employee("2015-09-12");


        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(employee1.getBirthDate());
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(employee2.getBirthDate());

        System.out.println(Employee.compare(date2,date1));
        }
    }

