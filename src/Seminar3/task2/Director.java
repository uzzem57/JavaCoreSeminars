package Seminar3.task2;

import java.util.List;

public class Director extends Employee{



    public Director( String name, String midName, String surName, int salary, String birthDate) {
        super( name, midName, surName, salary, birthDate);
    }

    /**
     * Метод повышения зарплаты сотрудников, без директора
     * @param company- массив сотрудников
     */
    public static void increaser (Employee [] company){
        for (int i = 0; i < company.length; i++) {
            if(company[i].getClass() != Director.class){
               company[i].setSalary(company[i].getSalary() + 7000);
            }
        }
    }

}
