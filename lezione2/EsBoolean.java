import java.util.Scanner;

public class EsBoolean {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = 1083544245;
        System.out.println(numero);
        boolean pari = numero%2 == 0;
        System.out.println("il numero è pari? " + pari);
        tastiera.close();  
    }
}
