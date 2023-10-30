package Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", Arrays.asList(4.0, 5.0, 4.0, 5.0, 5.0, 5.0),"Информатика"));
        students.add(new Student("Petrov", Arrays.asList(4.0, 5.0, 4.0, 5.0, 5.0, 5.0),"Информатика"));
        students.add(new Student("Sidorov", Arrays.asList(4.0, 5.0, 5.0, 5.0, 5.0, 5.0),"Информатика"));
        students.add(new Student("Konin", Arrays.asList(4.0, 5.0, 4.0, 5.0, 5.0, 5.0),"Геометрия"));
        students.add(new Student("Golovko", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0),"Информатика"));
        students.add(new Student("Prutov", Arrays.asList(4.5, 5.0, 4.0, 5.0, 5.0, 5.0),"Информатика"));
        students.add(new Student("Sokolov", Arrays.asList(4.0, 5.0, 4.8, 5.0, 5.0, 5.0),"Информатика"));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика"))
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

        filteredStudents.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }
}