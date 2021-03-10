package main;

class Automasinas {

    //Javā ir iespējams mantot atribūtus un metodes no citām klasēm. Mantojuma koncepts tiek grupēts divās grupās:
    /*
        subclass (child) - klase, kura manto no citas klases
        superclass (parent) - klase, no kuras tiek mantots

        lai mantotu no klases, tiek izmantots atslēgasvārds extends
        Piemērā klase Masina (subclass) mantos atribūtus un metodes no klases Automasinas (superclass)

     */

    protected String brends = "Hyundai";    //Automasinas atribūts
    //Atribūts ir azīmēts kā protected. Ja tas būtu kā private, tad klase Masina nespētu piekļūt šim atribūtam

    public void taure() {
        System.out.println("Beep, beep!");  //Automasinas metode
    }
}

    class Masina extends Automasinas {

        private String modelis = "i30 CW";      //Masina atribūts

        public static void main(String[] args) {

            //Izveidos objektu no Masina klases
            Masina manaMasina = new Masina();

            //Izsauks taure() metodi no Automasinas klases, izmantojot manaMasina objektu (jo manto).
            manaMasina.taure();

            //Attēlos vērtību no brends atribūta (Automasinas klase) un modelis atribūta (Masinas klase)
            System.out.println(manaMasina.brends + " " + manaMasina.modelis);

        }

        //Kad izmantot inheritance/mantošanu?
        //Tas ir noderīgs, lai varētu atkārtoti izmantot to pašu kodu.
        //Izmanto atribūtus un metodes no jau eksistējošas klases, tad kad izveido jaunu klasi.
        //Ja nevēlies, lai citas klases spētu mantot klasi, izmanto final atslēgasvārdu

    }

