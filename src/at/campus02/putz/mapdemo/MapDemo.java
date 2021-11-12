package at.campus02.putz.mapdemo;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        gradeOfStudents.put("Mustermann", 1);
        gradeOfStudents.put("Musterfrau", 2);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        // Schlüsselwort updaten
        gradeOfStudents.put("Mustermann", 3);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        // Iteration über alle Schlüssel
        // Shortcut: CTRL ALT V (???)
        Set<String> students = gradeOfStudents.keySet();
        for(String student : students){
            Integer grade = gradeOfStudents.get(student);
            System.out.println("Student*In " + student + " hat die Note " + grade);
        }

        // Möglichkeit 1 für Ausgabe
        Integer gradeofMustermann = gradeOfStudents.get("Mustermann");
        System.out.println("gradeofMustermann = " + gradeofMustermann);

        // Möglichkeit 2 für Ausgabe
        Set<Map.Entry<String, Integer>> entries = gradeOfStudents.entrySet(); // gradeOfStudents.entrySet(); CTRL ALT V
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Student*In " + entry.getKey() + " hat die Note " + entry.getValue());
        }
    }

}
