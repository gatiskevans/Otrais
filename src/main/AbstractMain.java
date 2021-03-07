package main;

public class AbstractMain {
    public static void main(String[] args) {

        //Jāizveido objekts no klases Studenti, kuri mantos visus atribūtus no klases Sesi
        Studenti dati = new Studenti();

        System.out.println("Vārds: " + dati.vards + "\n");
        System.out.println("Vecums: " + dati.vecums + "\n");
        System.out.println("Absolvēšanas gads: " + dati.absolvesanasGads + "\n");
        dati.macibas();     //Izsauks abstrakto metodi

    }
}
