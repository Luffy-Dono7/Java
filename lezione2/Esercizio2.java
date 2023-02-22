import java.util.Scanner;
import javax.print.event.PrintEvent;


public class Esercizio2 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci un numero di 4 cifre");
        int numero = Integer.parseInt(tastiera.nextLine());
        System.out.println(numero/1000);
        numero = numero%1000;
        System.out.println(numero/100);
        numero = numero%100;
        System.out.println(numero/10);
        numero = numero%10;
        System.out.println(numero);
        tastiera.close();        
    }
}
