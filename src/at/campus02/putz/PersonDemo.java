package at.campus02.putz;

public class PersonDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Max", "Mustermann");
        Person person2 = new Person("Max", "Mustermann");

        boolean isEqual = person1.equals(person2);
        System.out.println("isEqual = " + isEqual);

    }
}
