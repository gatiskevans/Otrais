package main;

public class InnerClass {

    //Java ir iespējam arī izveidot klases iekšā klasēs. To sauc par Inner Class vai Nested Class
    //Nesting classes mērķis ir sagrupēt klases, kuras pieder kopā, tādējādi veidojot kodu caur pārlasāmāku

    public static void main(String[] args) {
        ArejaKlase manaArejaObj = new ArejaKlase();
        ArejaKlase.IeksejaKlase manaIeksejaObj = manaArejaObj.new IeksejaKlase();
        System.out.println(manaArejaObj.x + manaIeksejaObj.y);

        //Tā kā StatiskaKlase ir static, tad nevajag izveidot objektu ArejaKlase, lai piekļūtu StatiskaKlase
        ArejaKlase.StatiskaKlase statiskaKlaseObj = new ArejaKlase.StatiskaKlase();
        System.out.println(statiskaKlaseObj.z);

        //Izveidojam objektus iekšējai klasei Pieklut, un piekļūsim atribūtam x, kas ir ārējā klasē
        ArejaKlase.Pieklut pieklutArejaiObj = manaArejaObj.new Pieklut();
        System.out.println(pieklutArejaiObj.pieklusimX());

    }

    //Iekšējā klase var būt private vai protected.
    //Ja nevēlies, ka objekti no ārpuses var piekļūt iekšējai klasei, tad deklarē klasi kā private
    //Šajā piemērā, ja IeksejaKlase būtu kā private, tad no InnerClass to nevarētu izsaukt. Būtu error

}

class ArejaKlase {

    //Lai piekļūtu iekšējai klasei, vispirms ir jāizsauc ārējās klases objekts, un tad jāizveido iekšējās klases objekts
    int x = 10;     //Šis ir ārējās klase atribūts

    class IeksejaKlase {

        int y = 5;      //Šis ir iekšējās klases atribūts

    }

    //Iekšējā klase var būt arī static, kas nozīmē, ka vari piekļūt tai neizveidojot objektu ārējai klasei
    static class StatiskaKlase {
        double z = 13.25d;
    }
    //Static iekšējai klasei nav piekļuves ārējās klases atribūtiem, metodēm utt

    //Priekšrocība iekšējām klasēm ir tāda, ka tās var piekļūt atribūtiem un metodēm no ārējās klases
    class Pieklut {
        public int pieklusimX() {
            return x;
        }
    }

}