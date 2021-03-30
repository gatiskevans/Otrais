package main;
import java.util.Scanner;

public class Astoni {

    //Package ir domāta, lai grupētu radniecīgas klases. To var iztēloties kā folderi failu direktorijā
    //Packages tiek izmantotas, lai izvairītos no vārdu/nosaukumu konfliktiem, un lai labāk uzraudzītu kodu
    //Packages ir iedalītas divās grupās:
    /*
            Build-in Packages - Packages no Java API
            User-defined Packages - Lietotāja izveidotas packages
     */

    /* Build-in Packages

        Javai ir Java API bibliotēka ar pre-written klasēm, kuras ir brīvi pieejamas, iekļautas JDK
        Bibliotēkā ietilpst komponentes, lai varētu pārvaldīt input, datubāzu programmēšanu un daudz ko citu.
        Pilnu bibliotēku (library) sarakstu var atrast: https://docs.oracle.com/javase/8/docs/api/

        Bibliotēka ir sadalīta packages un classes. Tas nozīmē, ka tu vari gan importēt vienu konkrētu klasi (ar
        visām metodēm un atribūtiem), gan visu package, kurā ietilpst visas klases, kas pieder konkrētajam package.

        Lai pievienotu package vai klass no bibliotēkas, ir jāizmanto atslēgasvārds import

        Sintakse ir: import package.name.Class;     Šis importēs konkrētu klasi
                     import package.name.*;         Šis importēs visu package

        Kā piemēru var izmantot Scanner klasi, kura ir domāta, lai iegūtu user input.
        import java.util.Scanner;
        Šajā piemērā java.util ir package, kamēr Scanner ir klase, kas ietilpst java.util package
        Lai izmantotu Scanner klasi, izveido tās klases objektu un izmanto jebkuru metodi ko var atrast Scanner
        klases dokumentācijā. Piemērā izmantošu nextLine(); metodi, kura ir domāta, lai lasītu visu rindu.

     */

    public static void main(String[] args) {

        Scanner mansObjekts = new Scanner(System.in);
        System.out.println("Ievadi lietotājvārdu");

        String lietotajvards = mansObjekts.nextLine();
        System.out.println("Lietotājvārds ir: " + lietotajvards);

    }

    //User-defined Packages
    //Java izmanto failu sistēmu līzīgi kā folderi uz PC.
    /*      __ Root
               __ mypack
                   --MyPackageClass.java
     */

    //Lai izveidotu package, izmanto package atslēgasvārdu


}
