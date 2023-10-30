import java.util.Scanner;

public class Strings {
    //Class name String führt zu problemen
    public static void main(String[] args){

        //String is kein primtivier Datentyp sonder eine Klasse ein, ein Array from Chars
    String string1  = "Das ist ein String";
    String string2 = "Das ist auch ein String";

        System.out.println(string1.equals(string2)); //false
        System.out.println(string1.contains("ist ein")); //true enhält eingabe
        System.out.println(string1.startsWith("Das"));
        System.out.println(string2.endsWith("ing"));
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());
        System.out.println(string1.charAt(12)); //  gibt das zeichen wieder das an der Stelle ist
        System.out.println(string1.indexOf("ist"));// wo der wert startet //gibt die eerste position aus die gefunden wird
        System.out.println(string1.indexOf("Haus")); // -1 weils nicht gefunden werden kann
        System.out.println(string1.indexOf("i")); //erste postition von i
        System.out.println(string1.lastIndexOf("i")); // letzte position von i
//        System.out.println(Arrays.toString(string1.split(" "))); //gibt ein array aus und cuttes string in mehrere Teile bei jedem  " " Leerzeichen (funktioniert nicht, weiß noch  nicht warum)


        // ########################################### String Builder ####################################

        StringBuilder builder = new StringBuilder(); //lässt uns strings bauen
        String [] array = {"das","ist", "kein", "String", "Array"};

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]); // macht aus array Stringbuilder

        }
        String s = builder.toString(); // macht wieder String darauf





        // ################################

        Scanner scan= new Scanner(System.in);
        System.out.println("gibt ein Satz ein");
        String satz = scan.nextLine();
        checkSentence(satz);


    }
    public static void checkSentence(String satz){
        char[]chars = satz.toCharArray(); // macht String to ein Char array
        int grossB = 0;
        int kleinB = 0;
        int leerz = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                leerz++;
            }
            if(Character.isUpperCase(chars[i])){
               grossB++;
            }
            if(Character.isLowerCase(chars[i])){
                kleinB++;
            }




        }
        System.out.println("Gro0 " +  grossB + " klein" + kleinB + " Leerzeichen" + leerz);
    }
}
