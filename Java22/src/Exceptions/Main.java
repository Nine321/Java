package Exceptions;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exception ist ein Fehler, der Während der Laufzeit eines Programmes auftritt

//###################################
        int i = 0;
//     System.out.println(5/i); //wäre ein Fehler da macht nichts durch 0 Teilen kann (.ArithmeticException)

//###################################
        Random random = null; //erstellt ein Objekt hinter den aber keine implementierung steht
//        System.out.println(random.nextInt(10)); //gibt ein Fehler weil random null ist (.NullPointerException)


//###################################
        int[] num = {1, 2, 3};

        for (int j = 0; j < 4; j++) {
//            System.out.println(num[j]); //Fehler da out of bounds von Array (.ArrayIndexOutOfBoundsException)
        }

//###################################

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);//Fehler wenn man hier ein Wert eingibt der kein Int ist (.InputMismatchException)
    }
}
