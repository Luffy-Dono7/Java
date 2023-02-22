import java.util.Scanner;

public class EsBoolean2 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci il voto");
        int voto = 11;
        System.out.println(voto);
        boolean voto_verifica = voto >= 0 && voto <= 10;
        System.out.println("il voto è corretto? " + voto_verifica);
        tastiera.close();  
    }
}
