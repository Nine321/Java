public class zweidemsionaleArrays {
    public static void main(String[] args)
    {

        String [][] wochentag ={
                {"Montag", "1", ":(("},
                {"Dienstag", "2", ":("},
                {"Mittwoch", "3", ":|"},
                {"Donnerstag", "4", ":)"},
                {"Freitag", "5", ":))"},

        };
        for (String[] strings : wochentag) {
            for (String string : strings) {
                System.out.print(string+ " ");

            }
            System.out.println();
        }

    //########## würfel #############
        int [][][] würfel = new int[3][3][3];//höhe tiefe länge



        //Dreieckige arrays
        int [][]array = new int[5][];
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            array[i]= new int[i+1]; //erste inner array länge 1, zweites länge 2 , drittes länge 3,...

        }

        //########### erstellt quadratisches feld ########

        char [][] chars = new char[10][10];

        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars.length; i1++) {
                chars[i][i1]= '#';
            }
        }
        for (char[] aChar : chars) {
            for (char c : aChar) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(".......................................");
        System.out.println();


        int [][] multTable = new int[10][10];

        for (int i = 0; i < multTable.length; i++) {
            for (int i1 = 0; i1 < multTable.length; i1++) {
                multTable[i][i1] = (i+1) * (i1+1);
            }
        }

        for (int i = 0; i < multTable.length; i++) {
            for (int i1 = 0; i1 < multTable.length; i1++) {
                System.out.print(multTable[i][i1]+ "\t");  //schnell sout erstellten multTable.sout 
            }
            System.out.println();
        }

    }

}
