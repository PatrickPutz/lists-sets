package at.campus02.putz.studentlist;

import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("Putz");
        students.add("Gollmann");
        students.add("Tanner");
        students.add("Schmidt");

        System.out.println("Is there a student named Tanner? " + students.contains("Tanner"));
        System.out.println("");

        // Ausgabe aller Studenten
        for(String n : students){
            System.out.println(n);
        }

        System.out.println("");

        students.remove("Schmidt");
        for(String n : students){
            System.out.println(n);
        }

        System.out.println("");

        printStudents(students);

        isInList(students, "Tanner");
        System.out.println("isInList = " + isInList(students, "Tanner"));

        isInListAgain(students, "Tanner");
        System.out.println("isInListAgain = " + isInListAgain(students, "Tanner"));

    }
    
    public static boolean isInList(ArrayList<String> students, String student){
        for(String studentInList : students){
            if (studentInList.equals(student)){
                return true;
            }
        }
        return false;
    }

    public static boolean isInListAgain(ArrayList<String> students, String student){
        for (int i = 0; i < students.size(); i++){
            String stud = students.get(i);
            if (student.compareTo(stud) == 0){
                return true;
            }
        }
        return false;
    }
    
    public static void printStudents(ArrayList<String> students){
        for (String student : students){
            System.out.println("Student = " + student);
        }
        System.out.println("");
    }

}
