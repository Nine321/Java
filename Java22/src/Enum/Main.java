package Enum;
enum Jahrzeiten {
    FRÜHLING, SOMMER, HERBST, WINTER
}
public class Main {
    public static void main(String[] args){
        //Enum.Enum = Enumeration: Aufzählung

        Jahrzeiten coolsteJahreszeit = Jahrzeiten.SOMMER;

        switch (coolsteJahreszeit){
            case HERBST:
                System.out.println("Herbst");
                break;
            case SOMMER:
                System.out.println("Sommer");
                break;
            case FRÜHLING:
                System.out.println("Frühling");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
        }


        //########################

        Gamer gamer = new Gamer();

        switch (gamer.getDifficulty()){
            case LEICHT:
                //code für leichtes Spiel
            case MITTLE:
                //code für Mittle Spiel
            case SCHWER:
                //code für Schwer Spiel
        }

    }
}
