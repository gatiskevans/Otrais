package main;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datums {

    public static void main(String[] args) {

        //Java nav built-in date klase, bet mēs varam importēt java.time package, lai
        //varētu strādāt ar date un time API. Package iekļauj vairākas date un time klases:
        /*
            LocalDate           -   Attēlo datumu (yyyy-MM-dd) gads, mēnesis, diena
            LocalTime           -   Attēlo laiku (HH-mm-ss-ns) Stunda, minūte, sekunde, nanosekunde
            LocalDateTime       -   Attēlo gan datumu, gan laiku (yyyy-MM-dd-HH-mm-ss-ns)
            DateTimeFormatter   -   Formatētājs lai attēlotu date-time objektus

         */

        //Lai attēlotu pašreizējo datumu, import java.time.LocalDate klasi un izmanto metodi now();
        LocalDate pasreizejaisDatums = LocalDate.now();      //Izveidos date objektu
        System.out.println(pasreizejaisDatums);              //Attēlos pašreizējo datumu

        //Lai attēlotu pašreizējo laiku, import java.time.LocalTime klasi un izmanto metodi now();
        LocalTime pasreizejaisLaiks = LocalTime.now();       //Izveidos time objektu
        System.out.println(pasreizejaisLaiks);               //Attēlos pašreizējo laiku stundās, min, sek, nanosek.

        //Lai attēlotu pašreizējos laiku un datumu, import java.time.LocalDateTime un izmanto metodi now();
        LocalDateTime pasreizejaisLaiksDatums = LocalDateTime.now();    //Izveidos date/time objektu
        System.out.println(pasreizejaisLaiksDatums);                    //Attēlos pašreizējo laiku un datumu

        //Lai formatētu datumu un laiku izmanto DateTimeFormatter klasi. Piemērā augšup "T" tiek izmantots,
        //lai atdalītu datumu no laika, taču ja izmantosi ofPattern() metodi, tad varēsi mainīt date/time objektus
        //Piemērā tiks noņemtas "T" un nanosekundes no date-time

        //Jaunais patterns
        DateTimeFormatter jaunaisFormats = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        //No objekta, kas pieder LocalDateTime klasei, ar .format tiks formatēts Date-Time uz
        //jauno formātu, kas tika norādīts String jaunaisFormats objektā
        String formatetaisDatumsLaiks = pasreizejaisLaiksDatums.format(jaunaisFormats);

        //Attēlos datumu un laiku jaunajā formātā (dd-MM-yyyy HH:mm:ss)
        System.out.println(formatetaisDatumsLaiks);

        //ofPattern() metode pieņem vairāku veidu vērtību formātus, ja vēlies attēlot tos citos formātos:
        /*
            yyyy-MM-dd          -   "1998-05-27"
            dd/MM/yyyy          -   "27/05/1998"
            dd-MMM-yyyy         -   "27-May-1998"
            E, MMM dd YYYY      -   "Thu, May 29 1998"
         */

    }

}
