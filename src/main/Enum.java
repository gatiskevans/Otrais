package main;

public class Enum {

    //Enum ir īpašā klase, kura reprezentē konstantu grupu (nepārmaināmi mainīgie, piemēram, kā final)
    //Lai izveidotu Enum, izmanto atslēgasvārdu Enum (class vai interface vietā), un
    //konstantus atdali ar komatu.
    //Piezīme: Tiem ir jābūt uzrakstītiem ar lielajiem burtiem

    //Šis ir enum
    //Enum ir saīsinājums no vārda enumerācija, kas nozīmē "specifiski uzskaitīts"
    //Enum var izmantot iekšā klasē, kā arī ārpus klases
    enum Limenis {

        ZEMS,
        VIDEJS,
        AUGSTS

    }

    public static void main(String[] args) {

        //Enum var piekļūt, izmantojot punkts . sintaksi
        Limenis mansMainigais = Limenis.VIDEJS;
        System.out.println(mansMainigais);

        //Enums tiek bieži izmantoti switch statements, lai pārbaudītu attiecīgo vērtību
        switch(mansMainigais){

            case ZEMS:
                System.out.println("Zems līmenis");
                break;
            case VIDEJS:
                System.out.println("Vidējs līmenis");
                break;
            case AUGSTS:
                System.out.println("Augsts līmenis");
                break;
            default:
                System.out.println("Kaut kas nogāja greizi");

        }

        //Enum tipam ir iekļauta values() metode, kas atgriež masīva konstances.
        //Šī metode ir noderīga, ja vēlies iziet cauri ciklā visām enum vērtībām
        for(Limenis limeni : Limenis.values()) {
            System.out.println(limeni);     //Attēlos visas enum vērtības
        }
    }
}

/*Starpība starp enums un klasēm:

    - Enum, gluži kā klasei, var būt gan atribūti, gan metodes. Vienīgā starpība ir tāda, ka enum
      konstances ir public, static un final (nepārmaināmas)
    - Enum nevar tikt izmantots, lai izveidotu objektus, un to nevar izmantot kā entends citām klasēm,
      bet to var izmantot ar implements interfeisiem.

  Kāpēc izmantot enums?
    - Izmanto enums, tad kad tev ir vērtības, kuras tu zini, ka netiks nekad mainītas, piemēram, kā
      mēneša dienas, dienas, krāsas, kārtis utt.

 */
