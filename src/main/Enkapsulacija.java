package main;

public class Enkapsulacija {
    public static void main(String[] args) {
        Septini privats = new Septini();
        privats.setVards("Gatis");      //Uzstāda vērtību private mainīgajam vards
        System.out.println(privats.getVards());     //Attēlos private mainīgā vērtību
    }

    //Kāpēc enkapsulēt?
    //Labāka kontrolē klašu atribūtiem un metodēm
    //Klašu atribūti var tikt uztaisīti kā read-only (ja izmanto tikai get metodi), vai write-only (ja izmanto set)
    //Elastīgs. Programmētājs var mainīt tikai vienu daļu koda, neaizskarot pārējās daļas.
    //Uzlabota datu drošība
    

}
