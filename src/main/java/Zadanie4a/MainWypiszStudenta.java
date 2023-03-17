package Zadanie4a;

import java.util.ArrayList;
import java.util.List;

public class MainWypiszStudenta {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "Marek","Pieczarek",25));
        list.add(new Student(2L, "Wladek","Pieczarek",27));
        list.add(new Student(3L, "Abdul","Lomianki",26));
        list.add(new Student(4L, "Tafex","Tafko",19));
        System.out.printf("%-5s %-10s %-10s %-5s \n","Id", "Imie", "Nazwisko", "Wiek");
        for (Student student:list) {
            System.out.printf("%-5s %-10s %-10s %-5s \n",student.getId(),student.getImie(),student.getNazwisko(),student.getWiek());

        }
    }


}
