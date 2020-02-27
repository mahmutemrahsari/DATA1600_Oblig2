package main;

public class Rekursjon {

    //Test
    public static void main(String[] args) {
        //1.1
        System.out.println("Normal sum: " + sum(5));
        System.out.println("Recursive sum: " + sumRec(5));

        //1.2
        System.out.println("POW positive exp recursive: " + pow(4,3));
        System.out.println("POW negative exp recursive: " + pow(4,-3));

        //1.3
       int a[] = {1,2,4,5,6,7};
        System.out.println("Normal: ");
        tabellBaklengs(a);

        System.out.println("\nRecursive: ");
        tabellBaklengsRec(a,0,a.length-1);
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

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

    //1.3
    //Implementer en metode som skriver ut verdiene i en tabell baklengs. Bruk rekursjon.
    //Normal løsning
    static void tabellBaklengs(int a[]){
        // int a[] = {1,2,4,5,6,7};
        for(int i = 0; i<a.length; i++){
            System.out.print(a[a.length-i-1] + " ");
        }
    }

    //Rekursiv løsning
    static void tabellBaklengsRec(int a[], int start, int end){
        //Base
        if(start >= end)
        return;

        //Swapping logic
        int tmp;
        tmp = a[start];
        a[start] = a[end];
        a[end] = tmp;

        //Rekursiv kall
        tabellBaklengsRec(a,start+1,end-1);

    }


    //
    //1.4
    //Implementer en metode som finner den minste verdien i en heltallstabell. Bruk rekursjon.
    //
    //1.5
    //Implementer en metode som søker etter et gitt heltall i en heltallstabell. Bruk rekursjon.
    //Returner posisjonen til verdien i tabellen eller -1 hvis verdien ikke er i tabellen.
}
