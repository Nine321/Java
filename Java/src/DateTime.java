import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2023, Month.AUGUST, 12);
        System.out.println(date);

        LocalTime time = LocalTime.of(22,12,30);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(1992,7,12,14,31);
        System.out.println(dateTime);



        LocalDateTime ldt = LocalDateTime.now(); //gibt die genaue Zeit aus wo er erstellt wurde
        System.out.println(ldt);

        LocalDateTime ldt2 = ldt.plusMonths(5).plusDays(10).minusSeconds(20); // gibt für Jede Zeiteinheit eine Plus oder Minus Methode
        System.out.println(ldt2);

        System.out.println(ldt.toLocalDate().isLeapYear()); // prüft ob das Jahr ein Schaltjahr ist geht aber nur mit LocalDate, deswegen Datetime vorher in Local Date umwandeln

        System.out.println(ldt.isBefore(ldt2)); //prüft ob ldt vor ldt2 ist

        System.out.println(Duration.between(ldt, ldt2).toDays()); // gibt an wieviele Tage die zwei Daten ausenander liegen, kann da verschiede Zeiteinheiten wählen

        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd MM YY");
        DateTimeFormatter formatter2  = DateTimeFormatter.ofPattern("dd/MM/YYY");
        DateTimeFormatter formatter3  = DateTimeFormatter.ofPattern("EEEE dd MMM YYYY");
        DateTimeFormatter formatter4  = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy H:m:s").withLocale(Locale.FRANCE);
        System.out.println(formatter.format(ldt));
        System.out.println(formatter2.format(ldt));
        System.out.println(formatter3.format(ldt));
        System.out.println(formatter4.format(ldt));


        //Geschwindkeit von PC bestimmen


       long begin   = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);
        }
        long ende = System.nanoTime();
        System.out.println(ende-begin); // gibt arbeitdauert von programnm in nanosekunden aus




    }
}
