import java.util.Scanner;

public class EsBoolean3 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci il numero");
        int numero = 10;
        System.out.println(numero);
        boolean verifica_numero = numero%2 == 0 || numero < 5;
        System.out.println("il numero va bene? " + verifica_numero);
        tastiera.close();  
    }
}
