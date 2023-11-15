package BitsBytesBitweiseOperatoren;

public class Main {
    public static void main(String[] args) {
        //Dezimalsystem(10) 0-9 -> 149
        //Binärsystem(2) 0-1 -> 10010101

        //Bit: 0 oder 1 (kann ein wert an nehmen)
        //Byte: 8 Bits

        //Integer=  32 Bit -> 4 Byte

        //Byte Wertebereich  -128 bis 127
        //1111 1111 (erste bit(ganz links)gibt an ob zahl postiv(1) oder negativ(0))

        //0000 0000 -128
        //1111 1111 127

        //Bitweise Operator
        //& -Operator
        System.out.println("UND");
        System.out.println(true & true); // true
        System.out.println(true & false);  //false
        System.out.println(7 & 6); //6
        //7 =   0000 0111
        //6 =   0000 0110
        //7&6 = 0000 0110 = 6//weil 0 & 0 = 0      0 & 1 = 0       1 & 1 = 1

        System.out.println(10 & 25);// 8
        //10 =  0000 1010
        //25 =  0001 1001
        //10&25 0000 1000 = 8

        // | ODER Operator
        System.out.println("ODER");
        System.out.println(true | true); // true
        System.out.println(true | false);  //true
        System.out.println(7 | 6); //7
        //7 =   0000 0111
        //6 =   0000 0110
        //7|6 = 0000 0111 = 7//weil 0 | 0 = 0      0 | 1 = 1       1 | 1 = 1

        System.out.println(10 | 25);// 8
        //10 =  0000 1010
        //25 =  0001 1001
        //10|25 0001 1011 = 27

        // ^ XOR Operator
        System.out.println("XOR");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false);  //true
        System.out.println(7 ^ 6); //7
        //7 =   000 0111
        //6 =   000 0110
        //7^6 = 000 0001 = 1//weil 0 ^ 0 = 0      0 ^ 1 = 1       1 ^ 1 = 0

        System.out.println(10 ^ 25);// 8
        //10 =  000 1010
        //25 =  001 1001
        //10^25 001 0011 = 19

        // ~ Komplement Operator
        //dreht jeden bit um 0 -> 1  1 -> 0
        //ist immer die negative zahl von Eingabe minus 1
        System.out.println("Komplement");
        System.out.println(7);
        System.out.println(~7); //7
        //7 =   1000 0111 //erste ne 1 weil positive zahl
        //~7 =  0111 1000 = -8    0 -> 1  1 -> 0
        //0000 0000 = -128
        //rechnet jetzt  -128 + 64 + 32 + 16 + 8 = -8

        System.out.println(10);
        System.out.println(~10); //-11

        // Left-shift Operator (<<) verschiebt bis nach links
        System.out.println("Left Shift");
        System.out.println(11);
        System.out.println(11 << 2); // nimmt die bits von 11 und verschiebt die um 2 stellen nach links
        //11 =    000 1011
        //11<<2 = 010 1100  <-- nach links verschieben


        // Right-shift Operator (>>) verschiebt bis nach links
        System.out.println("Right Shift");
        System.out.println(11);
        System.out.println(11 >> 2); // nimmt die bits von 11 und verschiebt die um 2 stellen nach rechts
        //11 =    000 1011
        //11>>2 = 000 0010  --> nach rechts verschieben
    }
}
