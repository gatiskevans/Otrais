package main;

public class Septini {

    //Enkapsulācija nozīmē, ka sensitīvi dati ir paslēpti no lietotājiem. Lai to sasniegtu, tev vajag:
    //Izveidot mainīgos/atribūtus kā private
    //Nodrošināt publiskās get un set metodes, lai piekļūtu un papildinātu private vērtību mainīgajam.

    //Private mainīgie nozīmē to, ka tiem var piekļūt tikai tajā pašā klasē (cita klase nevar tiem piekļūt).
    //Tomēr, ir iespējams piekļūt tiem, ja tiek izveidotas public get un set metodes.
    //Get metode atgriež mainīgā vērtību. Set metode iedod vērtību.
    //Sintakse šīm metodēm ir tāda, ka tie sākas vai nu ar get vai set, un seko ar mainīgā nosaukumu,
    //kurš sākas ar lielo burtu.

    private String vards;   //Privāts. Liegta pieeja

    //Get
    public String getVards() {      //Iegūst mainīgā vards vērtību
        return vards;
    }

    //Set
    public void setVards(String jaunsVards) {       //Var uzstādīt mainīgā vards vērtību
        this.vards = jaunsVards;     //this tiek izmantots, lai atsauktos uz to, ka tiek izmantots pašreizējais objekts
    }

    //Tā kā mainīgais vards ir deklarēts kā private, tam nevar piekļūt ārpus šīs klases
    //Lai piekļūtu privātiem mainīgā datiem, tad tiks izmantotas getVards, setVards metodes
}
