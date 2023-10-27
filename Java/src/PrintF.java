import java.util.Locale;

public class PrintF {
    public static void main(String[] args){

        //Unicode 2^16 Zeichen ~ 65000
        System.out.println("\u1F2F");
        System.out.println("\u2F1F");
        System.out.println("das is ein Absatz \nund das wird ein Tab\t ja ein Tab");

        System.out.println();
        double zahl = 2323.232;
        int alter =23;
        String name= "Name1";
        //print f macht keinen neuen Absatz nach sout, würdere mehrer souts hintereinander schreiben
        System.out.printf("Lieblingszahl %8d ist gleich \nund ist soo alt %.2f \nund das ist der name %s %8S\n", alter, zahl, name, name );
        //  %s = String
        //  %S = String in CapitalLetters
        //  %d = int
        //  %f = flaot/ double
        //  %8d = füllt leerzeichen ein um ingesamt auf 8 TZeichen zu kommen (geht auch vor S)
        //  %08d = füllt 0 en ein um auch ingsamt 8 Zeichen zu kommen (geht nicht vor s)
        //  %.2f = 2 nachkommastellen // schreibt ein Komma weil nimmt die Systemsprache also deutsch
        //  %10.2f = ingesammt 10 zeichen und 2 Nachkommastellen

        System.out.printf(Locale.US,"und ist soo alt %.2f ",  zahl );
        //schreibt dann  %.2f nach Amerikantischer schreibweise

    }
}
