package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Map speichert 2 Werte
        Map map = new HashMap();
        map.put("Apel", 0.02);
        map.put(true, 123);
//        map.put(true,1231);//würde dann den zweitn true wert ausgeben, wenn gleicher key
        //(Key, Value)

        System.out.println(map.get("Apel"));
        System.out.println(map.get(true));


        //#############################
        //legt die Datentypen von Key und Value fest
        Map<Integer, String> plz = new HashMap<>();
        plz.put(12312, "Hamburg");
        plz.put(7534, "Köln");
        plz.put(16542, "Vinsebeck");

        //jeder key soll einzigartig bleiben, sonst wird immer die erste eintrag mit gleichen Key überschrieben

        //####################

        Map<String, Integer> mountains = new HashMap<>();
        mountains.put("Berg1",12312);
        mountains.put("Berg2",351312);
        mountains.put("Berg3",8712);
        mountains.put("Berg4",112);

        mountains.remove("Berg4");

        //Testen ob key in map erhalten ist
        System.out.println(mountains.containsKey("Berg3")); //gibt ein boolen zurück

        //Testen ob value enthalten ist
        System.out.println(mountains.containsValue(3411));

        //um Wert von key zu ersetzen
        System.out.println(mountains.get("Berg2"));
        mountains.replace("Berg2",19);
        System.out.println(mountains.get("Berg2"));


        //um Hashmap auszulesen Set erstellen

        Set<String> keySet = mountains.keySet();

        for (String s : keySet) {
            System.out.println(s + "  "+ mountains.get(s));
        }


    }
}
