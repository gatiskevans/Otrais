package main;

public class Abstraction {

    //Datu abstrakcija ir process, lai paslēptu konkrētas detaļas un parādītu lietotājam tikai pašu nepieciešamāko
    //Abstrakcija ir sasniedzama ar abstract klasēm vai interfeisiem

    //Atslēgasvārds abstract ir non-access modifier, to izmanto priekš klasēm un metodēm
    /*Abstract class - Ierobežota klase, kuru nevar izmantot, lai izveidotu objektus (lai tai piekļūtu
                       tai jābūt mantotai no kādas citas klases).
      Abstract methods - var tikt izmantota tikai abstract klasē, tām nav body{}. Body izveido subklasēs, kuras manto
     */

    //Abstract klasei var būt gan abstract, gan regulārās metodes

    public static void main(String[] args) {
        Pile manaPileObj = new Pile();
        manaPileObj.dzivniekuSkanas();
    }

}

abstract class Dzivnieki {

    //Abstract metode
    public abstract void dzivniekuSkanas();

    //Regulārā metode
    public void gulet() {
        System.out.println("Zzzzzz...!");
    }

    //Šajā piemērā nav iespējams izveidot objektu klasei Dzivnieki
    //Dzivnieki mansObjekts = new Dzivnieki();    ģenerēs error

}

//Lai piekļūtu Dzivnieki abstract klasei, tai jābūt mantotai no kādas citas klases

//Subklase (Mantos no klases Dzivnieki)
class Pile extends Dzivnieki {

    //Metodes dzivniekuSkanas() body tiek norādīts šeit
    public void dzivniekuSkanas() {
        System.out.println("Pīle saka: Pēk, pēk");
    }

}

//Kāpēc un kad izmantot abstract klases un metodes
//Lai sasniegtu drošību - paslēp konkrētas detaļas un attēlo tikai svarīgāko no objekta
//Abstrakciju var sasniegt arī ar interfeisiem.