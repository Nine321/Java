package Wrapper;

public class Main {

    public static void main(String[] args){
//      Wrapper Klasse <=> primitiv Datentyp
//      Integer              int
//      Boolean             boolean
//      Character              char


        Integer integer = 5;
        integer.toString(); //Wrapper Klassen haben können funktionen aufrufen
        // da sie aber als Klasse gespeichert werden sind sie sehr langsam

//        int int1 = null; geht nicht
        Integer integer1 = null;  //können den Wert null haben

        String zahl = "5";
        int i5 = Integer.parseInt(zahl); // macht aus String ein Integer

        String booh ="true"; // muss den datentyp entsprechen der geparst wird
        Boolean boolean1 = Boolean.parseBoolean(booh);

        Boolean.logicalAnd(false, true);// gibt true


        //################################# Boxing (VERALTET) ###################
        int i = 5;
        Integer i2 = new Integer(i);    //Boxing (veraltet)
        Integer i3 = i;                 //Autoboxing

        int j = i2.intValue();          //Unboxing (veraltet)
        int j2 = i2;                    //Autounboxing


        //###################### Verwendung ####################################

//        Grundsätzlich immer primitive Datentype
//
//        Wrapper-Klassen
//            Collection.Listen
//            FrameWorks
//            Werte die in DB speichern


    }
}
