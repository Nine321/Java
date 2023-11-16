package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        List<String> liste = new ArrayList<>();

        int []intArray = {1,2,3};
        String[] stringArray = {"eins", "zwei","drei"};
        double [] doubleArray = {1.12,2.42,3.2};
        auslesen(intArray);
        auslesen(stringArray);
        auslesen(doubleArray);

        //Einfacher mit Generic
        //Generic funktionieren nur mit Wrapperklassen

        Integer [] intArray2 ={2,45,33};
        auslesen(intArray2);

        Character[] charArray = {'a','3','o'};
        auslesen(charArray);


    }
            //Type = freiwählbarer Name (grüne Farbe zeigt das es ein Generic ist)
    public static <Type> void auslesen(Type[] typeArray){
        for (Type t : typeArray){ //Type veränder sich immer zu den Datentyp der gerade gebraucht wird
            System.out.println(t + " Test");
            System.out.println(t.getClass()); //zeigt die Wrapperklasse
        }
    }
    public static void auslesen(int[] intArray){
        for (int i : intArray) {
            System.out.println(i);

        }
    }
    public static void auslesen(String[] stringArray){
        for (String i : stringArray) {
            System.out.println(i);
        }
    }
    public static void auslesen(double[] doubleArray){
        for (Double i : doubleArray) {
            System.out.println(i);
        }
    }
}
