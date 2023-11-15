package HashMap;

import java.util.*;

public class QuizApp {
    public static void main(String[] args){
        Map<String, String > quiz = new HashMap<>();
        quiz.put("Frankreich", "Paris");
        quiz.put("Deutschland", "Berlin");
        quiz.put("Russland", "Moskau");
        quiz.put("Polen", "Warschau");

        //Maps arbeiten nicht mit Index, deswegen einmal alle einträge in Liste speichern
        List<String> countries = new ArrayList<>();
        countries.addAll(quiz.keySet()); //speichert alle keysets in Liste(mit index)

        Random ran = new Random();

        Scanner scan = new Scanner(System.in);

        while (true){
            int index = ran.nextInt(countries.size());
            String country = countries.get(index);
            System.out.println("Hauptstadt von "  + country);

            if (scan.next().equals(quiz.get(country)) ){
                System.out.println("richtig");
            }else{
                System.out.println("Falsch Hauptstadt wäre " + quiz.get(country));
            }
        }

    }
}
