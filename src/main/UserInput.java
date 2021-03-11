package main;
import java.util.Scanner;   //Importējam Scanner klasi

public class UserInput {

    //Scanner klase tiek izmantota, lai dabūtu lietotāja datu ievadi, un to var atrast java.util package
    //Lai izmantotu Scanner klasi, izveido objektu no tās klases un izmanto jebkādu metodi,
    //kādas atrodamas Scanner klases dokumentācijā.
    //Šajā piemērā tiks izmantota nextLine() metode, kas tiek izmantota, lai lasītu Strings

    public static void main(String[] args) {
        Scanner jaunsObjekts = new Scanner(System.in);      //Izveidojam Scanner klases objektu

        System.out.println("Ievadi vārdu, vecumu un algu");

        String lietotajVards = jaunsObjekts.nextLine();     //Lasīs lietotāja String ievadīto informāciju

        //Skaitliskais input
        int vecums = jaunsObjekts.nextInt();
        double alga = jaunsObjekts.nextDouble();

        System.out.println("Vārds: " + lietotajVards);
        System.out.println("Vecums: " + vecums);
        System.out.println("Alga: " + alga);

        //Piezīme, ja tiek izmantots nepareizais input (proti, teksts skaitļa vietā), tad
        //parādīsies exception/error paziņojums (piemēram, "InputMismatchException")

    }

    /*  Lai lasītu citu datu tipus var izmantot šādas metodes:

            nextBoolean()   -   Lasa boolean vērtību no lietotāja
            nextByte()      -   Lasa byte vērtību no lietotāja
            nextDouble()    -   Lasa double vērtību no lietotāja
            nextFloat()     -   Lasa float vērtību no lietotāja
            nextInt()       -   Lasa int vērtību no lietotāja
            nextLine()      -   Lasa String vērtību no lietotāja
            nextLong()      -   Lasa long vērtību no lietotāja
            nextShort()     -   Lasa short vērtību no lietotāja

     */

}
