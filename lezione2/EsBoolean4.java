import java.util.Scanner;

public class EsBoolean4 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci il numero");
        int numero = 1024;
        System.out.println(numero);
        boolean verifica_numero = numero > 1000 && numero%10 == 3;
        System.out.println("il numero va bene? " + verifica_numero);
        tastiera.close();  
    }
}
