package main;

public class Pieci {
    public static void main(String[] args) {

        //Ir divu veidu modifiers - access modifier un non-access modifier
        //Access modifiers controlē piekļuves līmeni
        //Non-Access modifiers nekontrolē piekļuves līmeni, bet nodrošina citas funkcionalitātes

        //Access modifiers:

        /*Priekš klasēm tiek izmantoti šādi:

                public - klasei var piekļūt ar jebkuru citu klasi
                default - klasei var piekļūt tikai ar klasēm, kas atrodas tajā pašā package.
                          Tas tiek izmantots, kad netiek norādīts modifier

         */

        /*Priekš atribūtiem, metodēm un konstruktoriem tiek izmantoti šādi modifiers:

            public - kods ir pieejams visām klasēm
            private - kods ir pieejams tikai klasē, kurā atrodas
            default - kods ir tikai pieejams, ja atrodas tajā pašā package.
                      Default tiek izmantots, kad nenorāda modifier.
            protected - kods ir tikai pieejams, ja atrodas tajā pašā package un subklasēs.

         */

        //Non-Access Modifiers:

        /*Priekš klasēm tiek izmantoti šādi:

            final - klase navar tikt mantota kādai citai klasei
            abstract - klasi nevar izmantot, lai izveidotu objektus. Lai piekļūtu abstract klasei,
                       tai ir jābūt mantotai no citas klases.

         */

        /*Priekš atribūtiem un metodēm izmanto šādus modifiers:

            final - atribūti un metodes nav tikt pārrakstīti/modificēti
            static - atribūti un metodes pieder klasei nevis objektam
            abstract - Var tikt izmantoti tikai abstract klasēs, un tikai uz metodēm.
                       Metodei nav body, piemēram abstract void run(); Body ir norādīts subklasē(mantots no).
            transient - atribūti un metodes tiek izlaistas, kad tie atrodas objektā, kud to serializē.
            synchronized - katrai metodei var piekļūt pēc kārtas pa vienai.
            volatile - atribūta vērtība netiek ielikta kešā, un ir vienmēr lasīta caur "galveno atmiņu".

         */

        //ja nevēlies, ka atribūta vērtība tiek mainīta, tad var izmantot final
        final double PI = 3.14d;

    }
}
