package main;

public class Rekursjon {

    //Test
    public static void main(String[] args) {
        //1.1
        System.out.println("Normal: " + sum(5));
        System.out.println("Recursive:" + sumRec(5));

        //1.2
        System.out.println("POW positive exp recursive: " + pow(4,3));
        System.out.println("POW negative exp recursive: " + pow(4,-3));

    }

    //1 Rekursjon
    //1.1
    //Konverter følgende metode til en løsning med rekursjon:

    static int sum(int x) {
        int sum = 0;
        for(int i = x; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }
    //1.1 Løsning
    static int sumRec(int x) {
        if(x <= 1) {
            return 1;
        }
        return x + sumRec(x-1);
    }

    //1.2
    //Implementer metoden pow(int base, int exponent), som skal kalkulere base^exponent. Bruk rekursjon.
    //
    //Du kan ta i bruk følgende relasjon:
    //
    //base^exponent = base * base^exponent-1
    //og:
    //
    //base^1 = base

    // Denne løsningen er for både positive og negative exponenter
    //1.2 Løsning
    static double pow(int base, int exponent){
        //hvis expo negative
        if(exponent<0){
            return 1/pow(base,-exponent);
        }
        //hvis expo positive
        if(exponent>0)
            return base * pow(base, exponent-1);
        //base, når expo er lik null
        return 1;
    }
}
