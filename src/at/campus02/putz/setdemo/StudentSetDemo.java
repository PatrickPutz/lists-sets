package at.campus02.putz.setdemo;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Max Mustermann");

        String susi = "Susi Sorglos";
        students.add(susi);

        System.out.println("Students: " + students);

        // Sets können nur einzigartige Einträge haben, keine Duplikate
        students.add(susi);
        System.out.println("Students: " + students);

        students.remove(susi);
        System.out.println("Students: " + students);

        boolean isSusiInSet = students.contains(susi);
        boolean isMaxInSet = students.contains("Max Mustermann");

        System.out.println("isSusiInSet = " + isSusiInSet);
        System.out.println("isMaxInSet = " + isMaxInSet);

        students.add(susi);

        // Jeden Studenten in Set ausgeben
        for (String student : students){
            System.out.println("Student: " + student);
        }

    }

}
