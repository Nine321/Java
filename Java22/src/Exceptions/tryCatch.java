package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        try { //was geprüft werden soll
            int number = scan.nextInt();
            System.out.println(number);
        } catch (InputMismatchException exception) { //Welche Expection man abfangen möchte und freiwählbarer namen der exception
        // was passieren soll, wenn expection ausgelöst wird, damit programm normal weiterläuft
            System.out.println("keine Zahl");
        } finally {
            //Code der immer ausgeführt wird egal ob Exception ausgelöst wird oder  nicht
            scan.close();
            System.out.println("Scanner geschlossen");

        }




    }
}
