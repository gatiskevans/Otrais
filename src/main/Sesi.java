package main;

abstract class Sesi {

    public String vards = "Gatis";
    public int vecums = 27;

    //abstract metode atrodas tikai abstract klasē. Tai nav body. Body ir jānorāda subklasē
    public abstract void macibas();

}

class Studenti extends Sesi {

    public int absolvesanasGads = 2012;
    public void macibas() {     //Šeit tiek norādīts body
        System.out.println("Studēju visu dienu!");
    }

}