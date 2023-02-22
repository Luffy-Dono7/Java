import java.util.Scanner;

public class Esercizio4String {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String s = "Karim";
        System.out.println(s);
        String s2 = " Karim ";
        System.out.println(s2);
        String trim = s2.trim();
        System.out.println(s.equalsIgnoreCase(trim));
    }
}
