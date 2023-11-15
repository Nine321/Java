package Exceptions;

import java.util.Scanner;

public class ExceptionThrower {

    public void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl ein:");
        int number = scan.nextInt();

        if (number==0){
          throw new ArithmeticException("Nicht durch 0 teilen"); //löst selbstständig ne exception aus und gibt eigene Fehlermeldung zurück
        }
        if (number==1){
            throw new ArithmeticException("Nicht durch 1 teilen"); //löst selbstständig ne exception aus und gibt eigene Fehlermeldung zurück
        }

        System.out.println(10/number);
    }
}
