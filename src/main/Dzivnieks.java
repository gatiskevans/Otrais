package main;

class Dzivnieks {

    //Polimorfisms nozīmē vairākas formas.
    //Līdzīgi kā mantošana, polimorfisms izmanto mantotos atribūtus un metodes, lai vienu lietu darītu dažādos veidos.
    //Piemērā Dzivnieks ir superclass, un subklasē būs dažāda veida dzīvnieki.
    //Dzivnieks superklasē ir metode dzivniekuSkanas()
    //Tā kā katrs dzīvnieks izdveš savādākas skaņas, tad katra subklase izpildīs šo vienu metodi dažādāk.

    public void dzivniekuSkanas() {
        System.out.println("Dzīvnieks taisa skaņas");
    }
}

class Sivens extends Dzivnieks {
    public void dzivniekuSkanas() {
        System.out.println("Sivēns saka oink, oink");
    }
}

class Suns extends Dzivnieks {
    public void dzivniekuSkanas() {
        System.out.println("Suns saka vau, vau");
    }
}

class Aita extends Dzivnieks {
    public void dzivniekuSkanas() {
        System.out.println("Aita saka mēē, mēē");
    }
}

class Main {
    public static void main(String[] args) {

        Dzivnieks dzivnieks = new Dzivnieks();      //Izveido dzivnieks objektu
        Dzivnieks sivens = new Sivens();         //Izveido sivens objektu
        Dzivnieks suns = new Suns();           //Izveido suns objektu
        Dzivnieks aita = new Aita();           //Izveido aita objektu

        dzivnieks.dzivniekuSkanas();
        sivens.dzivniekuSkanas();
        suns.dzivniekuSkanas();
        aita.dzivniekuSkanas();

    }
}

//Kāpēc un kad izmantot mantošanu un polimorfismu?
//Tas ir noderīgs, lai izmantotu kodu atkārtoti.
//Izmanto atribūtus un metodes no jau eksistējošas klases, kad izveido jaunu klasi.