package main;

public class Cetri {

    //Konstruktoriem var arī pievienot parametrus.
    int x;

    //Izveidojam parametru y un uztaisam, ka x=y
    public Cetri(int y){
        x = y;
    }

    //Var izveidot konstruktorus ar cik daudz parametriem vēlas

    int modelisGads;
    String modelisNosaukums;

    public Cetri(int gads, String nosaukums) {
        modelisGads = gads;
        modelisNosaukums = nosaukums;
    }

    public static void main(String[] args) {
        Cetri objekts = new Cetri(5);   //Ievietojam y vērtību, kad izveidojam objektu un izaucam konstruktoru
        System.out.println(objekts.x);     //Izsaucot x tik attēlota vērtība 5, jo x=y un y ir 5


        Cetri auto = new Cetri(2007, "Audi");
        System.out.println(auto.modelisGads + " " + auto.modelisNosaukums);

    }

}
