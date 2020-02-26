package main;

public class Rekursjon {

    public static void main(String[] args) {
        System.out.println("Normal: " + sum(5));
        System.out.println("Recursive:" + sumRec(5));

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
}
