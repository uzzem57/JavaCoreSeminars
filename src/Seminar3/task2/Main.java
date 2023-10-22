package Seminar3.task2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
// модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
// В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам
// и проследите, чтобы зарплата руководителя не повысилась.
public class Main {
    public static void main(String[] args) throws ParseException {
        Employee employee1 = new Employee("Ivan", "Ivanov", "Ivonovich", 50000, "1999-04-04");
        Employee employee2 = new Employee("Petr", "Petrov", "Petrovich", 55000, "1996-01-02");

        Director director1 = new Director("Tom", "Tomson","XXXXXX", 100000,"1995-12-14");

        Employee [] company = new Employee[3];
        company[0] = employee1;
        company[1] = employee2;
        company[2] = director1;

        Director.increaser(company);
        for (int i = 0; i < company.length; i++) {
            System.out.println(company[i].getSalary());
        }

    }
}