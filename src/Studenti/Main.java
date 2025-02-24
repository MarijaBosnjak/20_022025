package Studenti;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", 4));
        studenti.add(new Student("Mia", 5));
        studenti.add(new Student("Ivica", 2));
        Collections.sort(studenti);
        System.out.println("Zatim od najvecega prema najmanjem");
        studenti.sort(Comparator.reverseOrder());
        //Ova metoda Collections povlaci metodu compere to radi usporedbe ocjena
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}
