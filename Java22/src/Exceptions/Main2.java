package Exceptions;

import java.util.InputMismatchException;

public class Main2 {
    public static void main(String [] args) {
        ExceptionThrower exceptionThrower = new ExceptionThrower();
//        exceptionThrower.divide();

        try{
            exceptionThrower.divide();
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage()); //gibt die Expextion nachricht aus dem throw Objekt wieder
        }catch (InputMismatchException exception){ //kann auch mehrer Expection catchen
            System.out.println("Falscher Wert");
        }catch (Exception exception){ //Catch alles Expections
            System.out.println("Fehler");
        }


    }
}
