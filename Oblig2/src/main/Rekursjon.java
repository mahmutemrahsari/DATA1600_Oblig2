package main;

public class Rekursjon {

    public static void main(String[] args) {
        System.out.println("Normal: " + sum(5));
        System.out.println("Recursive:" + sumRec(5));

    }

    static int sum(int x) {
        int sum = 0;
        for(int i = x; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }

    static int sumRec(int x) {
        if(x <= 1) {
            return 1;
        }
        return x + sumRec(x-1);
    }
}
