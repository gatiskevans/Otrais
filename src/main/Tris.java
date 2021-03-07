package main;

public class Tris {

    //Constructor ir speciāla metode Java, lai inicializētu objektus.
    //Construktors var izsaukt tikai tad, kad objekts tiek izveidots
    //Konstruktorus var izmantos, lai pievienotu vērtības objektu atribūtiem

    int x;      //x ir klases atribūts

    //Šis izveido konstruktoru
    //Kontruktora nosaukumam jābūt tādam pašam kā klases nosaukumam
    //x nav jānorāda priekšā, ka tas ir int, jo tas tika izdarīts, kad izveidoja to kā klases atribūtu.
    //Ja x būs priekšā norādīts int, tad programma atgriezīs vērtību 0
    public Tris(){

        x = 5;      //Iedodam vērtību klases atribūtam x kā 5

    }

    //Visām klasēm ir kontruktori pēc default. Ja tu pats neizveido konstruktoru, tad Java to izveidos tavā vietā.
    //Bet ja Java to izveido tavā vietā, tu nevari norādīt vērtības objektu atribūtiem.


    //Konstruktoram nevar būt return tips, piemēram, kā void
    public static void main(String[] args) {

        Tris konstruktors = new Tris();     //Izveidojam jaunu objektu klasei Tris, kas izsauks konstruktoru
        System.out.println(konstruktors.x); //Parādīs x vērtību, kāds tika norādīts konstruktorā

    }

}
