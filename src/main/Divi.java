package main;

public class Divi {
    //Var arī izveidot objektu klasē un piekļūt pie tā no citas klases.
    //To parasti izmanto, lai labāk organizētu klases
    //Vienā klasē ir visi atribūti un metodes, kamēr otrā ir main() metode, kura izpilda kodu
    int a = 20;
    final int b = 48;       //Ja mēģinās pārraktīt šo vērtību, tad leks erro paziņojums, jo ir uzstādīts kā final

    String vards = "Jānis";
    String uzvards = "Bērziņš";

    //Statiskajai metodei var piekļūt neizveidojot objektu
    static void manaMetode(){
        System.out.println("Statiskā metode");
    }

    //Publiskajai metodei var piekļūt tikai, ja tiek izveidots objekts
    public void publiskaMetode(){
        System.out.println("Publiskā metode");
    }

}
