import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci tre numeri");
        int a = Integer.parseInt(tastiera.nextLine());
        int b = Integer.parseInt(tastiera.nextLine());
        int c = Integer.parseInt(tastiera.nextLine());
        double media = (a + b + c)/3;
        System.out.println("la media è " + media);
    }
}
