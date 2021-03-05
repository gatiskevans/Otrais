package main;

//klase vienmēr sākas ar lielo burtu un klases nosaukumam ir jābūt vienādam ar java failu
public class Otrais {

    int x = 5;

    public static void main(String[] args) {

        //Klases nosaukums pēc tam objekta nosaukums vienāds ar new komandu un klases nosaukums
        Otrais mansObjekts = new Otrais();

        //Izdrukās laikā objektu, kur int x paķerts no klases, jo objekti manto klases mainīgos
        System.out.println(mansObjekts.x);

        //Var izveidot arī vairākus objektus vienā klasē
        Otrais mansObjekts2 = new Otrais();
        System.out.println(mansObjekts2.x);

        //Piekļūstam klāt datiem no citas klases, citā failā
        Divi objekts3 = new Divi();
        System.out.println(objekts3.a);

        //Mainīgie klasēs patiesībā saucas atribūti. Šajā gadījumā x būs atribūts.
        //Vēlviens termins priekš klašu atribūtiem ir fields
        //Piekļūt atribūtiem var, izveidojot jaunu klases objektu un tad ar . simbolu atlasīt, kuru atribūtu izmantos

        //Var arī modificēt, definēt un mainīt atribūtu vērtības
        objekts3.a = 50;
        System.out.println(objekts3.a);
        System.out.println(objekts3.b);

        //Ja divi objekti piekļūst tiem pašiem atribūtiem vienā klasē, tos var izmainīt,
        //bet viena objekta izmaiņas neietekmēs otra objekta atribūta vērtību
        Divi objekts4 = new Divi();
        //Atcerieties, ka atribūts a tika nomainīts uz 50, taču objekts4 to attēlos kā 20
        System.out.println(objekts4.a);

        //Var izmantot cik daudz atribūtus vēlas
        Divi objekts5 = new Divi();
        System.out.println("Mans vārds ir " + objekts5.vards + " " + objekts5.uzvards + " un man ir " + objekts5.a + " gadu.");
        
    }
}
