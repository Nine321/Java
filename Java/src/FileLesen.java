import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLesen {
    public static void main(String[] args){
        File datei = new File("C:\\Users\\Teilnehmer\\Desktop\\Java\\Java\\textdatei.txt"); // kann backslashe auch zu / ändern brauch zwei \\ davon damit daraus nicht Funktionen werben  \n \t ,...
        File datei2 = new File("textdatei2.txt");  // braucht den Pfad nicht, wenns im Java oder ist (src oder geht anscheinend nicht)
        System.out.println(datei.isFile()); // überprüft ob Datei ein File ist
        System.out.println(datei2.isFile());
        Scanner scan = null;
        Scanner scan2 = null;

        //######################### einlesen & ausgeben #######################
       try{  //prüfen ob datei auch extestiert, wenn nicht gibt es eine Fehler meldung (damit programm nicht abbricht)
           scan = new Scanner(datei);// in Klammer immer das was man einlesen möchte //Datei einlesen
       }catch (FileNotFoundException e){
           System.out.println("File not found");
       }


        System.out.println(scan.nextLine()); //datei wird Zeile für Zeile eingelesen & spring in nächste Zeile


        while(scan.hasNext()){ //prüft ob es noch eine Zeile gibt
            System.out.println(scan.nextLine());
        }

        // ##################################### einlesen und speichern ##############################

        try {
            scan2 = new Scanner(datei2);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        while (scan2.hasNext()){
            int alter = scan2.nextInt();
            String name = scan2.next();
            String art = scan2.next();
            String farbe = scan2.next();

            KlassenObject1 hund = new KlassenObject1(alter, art,farbe, true);
            System.out.println(hund.alter + hund.fellfarbe);
        }

    }
}
