package at.campus02.putz.listdemo;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        // ArrayList deklarieren
        ArrayList<Integer> intList = new ArrayList<>();

        // Elemente der Liste hinzufügen
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(3);

        int first = intList.get(0);


        // for loop
        for(int i = 0; i < intList.size(); i++){
            int n = intList.get(i);
            System.out.println(n);
        }

        System.out.println("");

        // foreach loop
        for(int n : intList){
            System.out.println(n);
        }

    }

}
