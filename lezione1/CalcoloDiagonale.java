import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoloDiagonale {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Hai un rettangolo e devi trovare la sua diagonale:");
        System.out.println("Quanto misura la base?");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.println("Quanto misura l'altezza?");
        int altezza = Integer.parseInt(tastiera.nextLine());
        double diagonale = Math.sqrt(Math.pow(base, 2) + Math.pow(altezza, 2));
        double dapprossimata = Math.round(diagonale*100)/100.0;
        System.out.println("La diagonale è " + dapprossimata);
        tastiera.close();
        }
}
