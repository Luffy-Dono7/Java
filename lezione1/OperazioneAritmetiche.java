import java.util.Scanner;

public class OperazioneAritmetiche {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Hai un rettangolo e devi trovare il suo perimetro:");
        System.out.println("Quanto misura la base?");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.println("Quanto misura l'altezza?");
        int altezza = Integer.parseInt(tastiera.nextLine());
        int perimetro = (base * 2) + (altezza * 2);
        System.out.println("Il perimetro è " + perimetro);
        tastiera.close();
        }
}
