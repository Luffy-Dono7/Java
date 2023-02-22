import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nome = tastiera.nextLine();
        System.out.println("Quanti anni hai?");
        int età = Integer.parseInt(tastiera.nextLine());
        System.out.println("Ti chiami " + nome + " e hai " + età);
        }
}


