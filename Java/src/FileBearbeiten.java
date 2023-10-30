import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBearbeiten {
    public static void main(String[] args){
        File dateitest = new File("textdatei2.txt");
        System.out.println(dateitest.isFile());


        File datei = new File("test.txt"); // existiert jetzt noch nicht muss erst noch erstellt werden

        try {
            FileWriter writer = new FileWriter(datei, true);  //erstellt neue test.text datei // true aktiviert append mode sodass neue Zeile hinten an datei angehängt werde und nicht mehr alles gelöscht wird
            writer.write("Hello \n");
            writer.write("Linie 2\n"); //Funktioniert so noch nicht und würde alles was bereits in datei drin ist rauslöschen umd das rein zu schreiben (ohne appemnd & flush)
            writer.flush(); //schreibt alles was sich der writer speichert in datei // bis jetz noch alles in einer Zeile \n macht die absätze
            writer.close();//schließt writer objekt (muss man nicht aber ist guter stile)
        } catch (IOException e) {
            System.out.println("Datei konnte nicht bearbeitet werden");
        }

    }
}
