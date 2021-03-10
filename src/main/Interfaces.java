package main;

public class Interfaces {

    //Abstrakciju var sasniegt arī ar interface
    //Interface ir pilnībā abstrakta klase, kuru izmanto, lai grupētu radniecīgas metodes ar tukšiem bodies

    //Izveidojam objektu un izsaucam metodes no klases Karbonara
    public static void main(String[] args) {
        Karbonara edienuObj = new Karbonara();
        edienuObj.edienuVeidi();
        edienuObj.nogarsot();

        //Otrais piemērs ar vairāku interfeisu implementēšanu vielaikus
        Gatavs pabeigtsEdiensObj = new Gatavs();
        pabeigtsEdiensObj.edienuVeidi();
        pabeigtsEdiensObj.nogarsot();
        pabeigtsEdiensObj.sals();
        pabeigtsEdiensObj.piestaditRekinu();
    }

}

//Interfeiss
interface Edieni {

    public void edienuVeidi();  //Interfeisa metode. Nav body
    public void nogarsot();     //Interfeisa metode. Nav body

}

//Lai piekļūtu interface metodēm, interface vajag būt implemented (līdzīgi kā mantot) no citas klases,
//izmantojot implements atslēgasvārdu (līdzīgi kā extends). Body interface metodēm ir izveidots implement klasē.
class Karbonara implements Edieni {

    public void edienuVeidi() {     //Šeit tiek izveidots metodes body
        System.out.println("Karbonara ir ļoti garšīgs");
    }

    public void nogarsot() {
        System.out.println("Mmm...garšo labi. Vajadzēja nedaudz vairāk sāli");
    }

}

/*Piezīmes par interfaces:
    - Līdzīgi kā abstract, interfeisi nevar tikt izmantoti, lai izveidotu objektus (Piemērā augšup, nav iespējams
      izveidot objektu no Edieni klases).
    - Interfeisa metodēm nav body. Body tiek izveidots implements klasē
    - Kad veic implements interface klasei, tad visas metodes ir jāpārraksta
    - Interface metodes pēc noklusējuma jau ir abstract un public
      (tāpēc brīdinājums par redundant public 20. un 21.rindā).
    - Inteface atrobūti pēc noklusējuma ir public, abstract un final.
    - Interface nevar saturēt konstruktoru (tāpēc ka to nevar izmantot, lai izveidotu objektus).
 */

//Kad un kāpēc izmantot interface?
//Lai sasniegtu drošību - paslēp konkrētas detaļas, un lietotājam parādi tikai pašu svarīgāko no objektiem
//Java neatbalsta vairākkārtēju mantošanu (klase var mantot tikai no vienas superklases). Lai gan tas ir
//sasniedzams, izmantojot interfaces, tāpēc ka klase var implement vairākus interfeisus.
//Piezīme: Lai pievienotu vairākus interfeisus, atdali tos ar komatu. Skatīt piemēru lejā.

interface Garsvielas {
    public void sals();
}

interface Rekins {
    public void piestaditRekinu();
}

class Gatavs implements Edieni, Garsvielas, Rekins {

    @Override
    public void edienuVeidi() {
        System.out.println("Karbonara ir piedāvājumā");
    }

    @Override
    public void nogarsot() {
        System.out.println("Šim ēdienam tiešām noderētu nedaudz sāls");
    }

    @Override
    public void sals() {
        System.out.println("Pievienoju sāli");
    }

    @Override
    public void piestaditRekinu() {
        System.out.println("Šitais būs dārgi. Jāmaksā 10 000 rūpiju");
    }
}