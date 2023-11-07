package Collection.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        //Stack (Stapel von den man elemente hinunter nehmen kann oder neue drauf legen kann)

        //LIFO Last in, First out

        Stack<String> games = new Stack<>();
        games.push("Horizon");//ist das unterste Spiel
        games.push("Assassii");
        games.push("Days Gone"); // ist gerade das oberste Spiele

        System.out.println(games); //zeigt alle Elemente
        System.out.println(games.peek()); //zeigt letzte hinzugefügte Element

        String pop= games.pop();

        System.out.println(pop); // entfernt letzte Element von Stack und gibt es zurück

        String pop2= games.pop();

        games.push(pop);
        games.push(pop2);

        System.out.println(games);// hat die Reihenfolge geändert



        //############################ Queue (Warteschlange)#################
        //FIFO First in First out

        Queue<String> downloads = new LinkedList<>();
        downloads.add("lala");
        downloads.add("haha");
        downloads.add("hoho");

        System.out.println(downloads);
        System.out.println(downloads.peek()); //zeigt start, erste Element was hinzugefügt würde

        downloads.poll(); //entfernt erste Element

        System.out.println(downloads);
        System.out.println(downloads.element()); //zeigt nächste Element wie peek aber wirft the expection wenn Liste leer ist





    }
}
